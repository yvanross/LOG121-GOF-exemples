package Commande.Bottin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 * FicheControleur - Controleur pour un FicheDialog
 * @author Vincent Lacasse
 *
 */
public class FicheControleur implements ActionListener, DocumentListener {
	Fiche fiche;
	FicheDialog ficheDialog;
	
	public FicheControleur(FicheDialog ficheDialog) {
		this.ficheDialog = ficheDialog;
	}

	/*
	 * Méthodes requises pour implémenter DocumentListener 
	 */
	public void insertUpdate(DocumentEvent e) {
		ficheDialog.enableOK(isDocLengthNotZero(e));
	}

	public void removeUpdate(DocumentEvent e) {
		ficheDialog.enableOK(isDocLengthNotZero(e));
	}

	public void changedUpdate(DocumentEvent e) {
		ficheDialog.enableOK(isDocLengthNotZero(e));
	}

	/*
	 * Méthode requise pour implémenter ActionListener
	 */
	public void actionPerformed(ActionEvent e) {
		String commande = e.getActionCommand();
		if (commande.equals(FicheDialog.ACTION_OK)) {
			ficheDialog.setOKPressed(true);
			ficheDialog.setVisible(false);
		} else if (commande.equals(FicheDialog.ACTION_CANCEL)) {
			ficheDialog.setOKPressed(false);
			ficheDialog.setVisible(false);			
		}
	}
	
	/**
	 * Verifier si le document contient au moins un caractère non-blanc
	 * @param e
	 * @return true si le document n'est pas vide
	 */
	private boolean isDocLengthNotZero(DocumentEvent e) {
		boolean r = false;
		try {
			r = e.getDocument().getText(0, e.getDocument().getLength()).trim().length() != 0;
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
		return r; 
	}
}
