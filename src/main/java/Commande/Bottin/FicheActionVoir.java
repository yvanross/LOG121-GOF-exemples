package Commande.Bottin;

import java.awt.event.ActionEvent;

import javax.swing.Icon;

public class FicheActionVoir extends BottinAbstractAction {
		// private FicheDialog dialog;
		private final static long serialVersionUID = 313451234132L;
	
	public FicheActionVoir(Bottin bottin, 
			VuePrincipale vue, String texte, Icon icon, 
			String description, Integer mnemonic) {
		super(bottin, vue, texte, icon, description, mnemonic);
	}

	public void actionPerformed(ActionEvent e) {
		int index = vue.getIndex();
		gdc.faireCommande(new FicheCommandeVoir(bottin, index));
	}
}
