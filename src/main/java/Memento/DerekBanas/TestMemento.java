package Memento.DerekBanas;

// Memento Design Pattern Tutorial

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class TestMemento extends JFrame{

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        new TestMemento();
    }

    private JButton saveBut;
    private JButton undoBut;
    private JButton redoBut;

    // JTextArea(rows, columns)
    private JTextArea theArticle = new JTextArea(40, 60);

    // Create a caretaker that contains the ArrayList
    // with all the articles in it. It can add and
    // retrieve articles from the ArrayList
    Caretaker caretaker = new Caretaker();

    // The originator sets the value for the article,
    // creates a new memento with a new article, and
    // gets the article stored in the current memento
    Originator originator = new Originator();

    int currentArticle = 0;
    int saveFiles = 0;

    public TestMemento(){
        // Set basic information for the panel that will
        // hold all the GUI elements
        this.setSize(750, 780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();

        // Add label to the panel
        panel1.add(new JLabel("Article"));

        // Add JTextArea to the panel
        panel1.add(theArticle);

        this.saveBut = new JButton("Save");
        saveBut.addActionListener(e -> this.onSave());

        this.undoBut = new JButton("Undo");
        this.undoBut.setEnabled(false);
        this.undoBut.addActionListener(e -> this.onUndo());

        this.redoBut = new JButton("Redo");
        this.redoBut.setEnabled(false);
        this.redoBut.addActionListener(e -> this.onRedo());

        panel1.add(saveBut);
        panel1.add(undoBut);
        panel1.add(redoBut);

        // Add panel to the frame that shows on screen
        this.add(panel1);
        this.setVisible(true);

        // Saving the current value of the textbox now to be able to undo to it later on
        this.originator.set(this.theArticle.getText());
        Memento memento = this.originator.storeInMemento();
        this.caretaker.addMemento(memento);
     }

    /**
     * these 3 operation should be put private and used only for test using reflection.
     */
    public void save(){
        this.saveBut.doClick();
    }

    public void undo(){
        this.undoBut.doClick();
    }

    public void redo(){
        this.redoBut.doClick();
    }

    private void onSave(){
        // Get text in JTextArea
        String textInTextArea = this.theArticle.getText();

        // Set the value for the current memento
        this.originator.set(textInTextArea);

        // Add new article to the ArrayList
        this.caretaker.addMemento(originator.storeInMemento());

        // saveFiles monitors how many articles are saved
        // currentArticle monitors the current article displayed
        this.saveFiles++;
        this.currentArticle++;
        System.out.println("Save Files " + this.saveFiles);

        // Make undo clickable
        this.undoBut.setEnabled(true);
        this.redoBut.setEnabled(false);
    }

    private void onUndo(){
        if (this.currentArticle >= 1) {
            // Decrement to the current article displayed
            this.currentArticle--;
            // Get the older article saved and display it in JTextArea
            Memento memento = this.caretaker.getMemento(currentArticle);
            String textBoxString = this.originator.restoreFromMemento(memento);
            this.theArticle.setText(textBoxString);
            // Make Redo clickable
            this.redoBut.setEnabled(true);
        }

        if (this.currentArticle < 1) {
            this.undoBut.setEnabled(false);
        }
    }

    private void onRedo(){
        if (this.saveFiles > this.currentArticle) {
            // Increment to the current article displayed
            this.currentArticle++;
            // Get the newer article saved and display it in JTextArea
            Memento memento = this.caretaker.getMemento(currentArticle);
            String textBoxString = this.originator.restoreFromMemento(memento);
            this.theArticle.setText(textBoxString);
            // Make undo clickable
            this.undoBut.setEnabled(true);
        }

        if (this.saveFiles <= this.currentArticle) {
            this.redoBut.setEnabled(false);
        }
    }


    public JTextArea getArticle(){
        return this.theArticle;
    }

}
