package Composite.Repertoire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Exemple du parton Composite
 * @author Vincent Lacasse
 *
 */
public class Test extends JFrame {

	private JButton btnChoisir;
	private JButton btnFermer;
	private JTextArea txtResultat;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Construire l'écran et assigner une action aux deux boutons
	 */
	public Test() {
		buildScreen();
		btnChoisir.setAction(new ActionChoisir());
		btnFermer.setAction(new ActionFermer());
	}
	
	/**
	 * Contruire l'écran
	 */
	private void buildScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnChoisir = new JButton();
		panel.add(btnChoisir);
		
		btnFermer = new JButton();
		panel.add(btnFermer);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		txtResultat = new JTextArea();
		txtResultat.setFont(new Font("monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtResultat);
	}
	
	/**
	 * Action associee au bouton "Choisir"
	 * @author Vincent Lacasse
	 *
	 */
	private class ActionChoisir extends AbstractAction {
		ActionChoisir() {
			super("Choisir");
		}
		
		public void actionPerformed(ActionEvent e) {
			
    			JFileChooser fileChooser = new JFileChooser();
    			fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    			
		    int returnVal = fileChooser.showOpenDialog(null);
		    
		    if (returnVal == JFileChooser.APPROVE_OPTION) {   
		    		File nom = new File(fileChooser.getSelectedFile().getPath());
		    		
		    		// L'arbre est cree avec cet appel du constructeur de Repertoire
		    		Noeud base = new Repertoire(nom);
		    		
		    		// Afficher le contenu de la structure Composite
		    		txtResultat.setText(base.toString());
    			}
		}
	}
	
	/**
	 * Action associee au bouton "Fermer"
	 * @author Vincent Lacasse
	 *
	 */
	private class ActionFermer extends AbstractAction {
		ActionFermer() {
			super("Fermer");
		}
		
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}