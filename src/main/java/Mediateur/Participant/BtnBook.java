package Mediateur.Participant;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//A concrete colleague
class BtnBook extends JButton implements Command {

    /**
     *
     */
    private static final long serialVersionUID = 134252345L;
    Mediator med;

    BtnBook(ActionListener al, Mediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }

    public void execute() {
        med.book();
    }

}
