package Commande.Bottin;

import java.io.IOException;

import javax.swing.JOptionPane;

public class FicheCommandeFermer implements Commande {

	private Bottin bottin;
	
	public FicheCommandeFermer(Bottin bottin) {
		this.bottin = bottin;
	}

	public boolean faire() {
		try {
			bottin.ecrire();
		} catch (IOException e) {
    		JOptionPane.showMessageDialog(null, 
	    			"Erreur", "Erreur à l'écriture du bottin", JOptionPane.ERROR_MESSAGE, null);
		} finally {
			System.exit(0);
		}
		return false;
	}

	public void defaire() {	}

	public void refaire() {	}
}
