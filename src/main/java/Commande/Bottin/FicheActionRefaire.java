package Commande.Bottin;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Icon;

@SuppressWarnings({ "deprecation"})
public class FicheActionRefaire extends BottinAbstractAction implements Observer {
	private final static long serialVersionUID = 324124124L;
	
	public FicheActionRefaire(Bottin bottin, 
			VuePrincipale vue, String texte, Icon icon, 
			String description, Integer mnemonic) {
		super(bottin, vue, texte, icon, description, mnemonic);
		gdc.addObserver(this);
		setEnabled(false);
	}

	public void actionPerformed(ActionEvent e) {
		gdc.faireCommande(new FicheCommandeRefaire(gdc));
	}

	public void update(Observable o, Object arg) {
		setEnabled(gdc.peutRefaire());
	}
}
