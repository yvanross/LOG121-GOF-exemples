package MVC.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Contrôleur 
 * L'objectif du controleur est d'exécuter la logique de fonctionnement 
 * particulière à cette application.
 * 
 * Ce controleur implémente l'interface ActionListener, ce qui permet
 * à la vue d'enregistrer MonControleur auprès des boutons et du
 * champ de texte.
 * 
 * Lorsque qu'une instance de MonControleur est enregistée par un JButton
 * avec addActionListener(), alors la méthode actionPerformed() de 
 * MonControleur est appelée lorsque l'utilisateur presse et relache le bouton.
 * Dans le cas d'un JTexteField, actionPerformed() est appelé lorsque
 * l'utilisteur presse la clé "Enter".
 * 
 * @author Vincent Lacasse
 *
 */
public class MonControleur implements ActionListener {

	private MaVue maVue;
	private MonModele monModele;
	
	public MonControleur(MaVue maVue, MonModele monModele) {
		this.maVue = maVue;
		this.monModele = monModele;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String actionCommand = e.getActionCommand();
		
		// l'utilisateur a pressé "Enter" dans la boite de texte
		if (actionCommand.equals(MaVue.ACTION_TEXTE)) {
			
			/*
			 * On prend le texte de la vue, et on l'envoie au modèle.
			 * Cette opération modifie l'état du modèle et déclenche 
			 * l'activation du patron observer.
			 */
			rafraichirTexte();
		}
		
		// l'utilisateur a pressé le bouton "Nouvelle Fenêtre"
		else if (actionCommand.equals(MaVue.NOUVELLE_FENETRE)) {

			// On doit rafraichir le texte car l'utiliseur peut avoir 
			// avoir entrer un nouveau texte sans faire "Enter"
			rafraichirTexte();

			// On crée une nouvelle vue, qui elle, créera sa propre instance
			// de MonControleur.
			new MaVue(monModele);		
		}
		
		// l'utilisateur a pressé le bouton "Changer Couleur"
		else if (actionCommand.equals(MaVue.CHANGER_COULEUR)) {

			// On doit rafraichir le texte car l'utiliseur peut  
			// avoir entrer un nouveau texte sans faire "Enter"
			rafraichirTexte();
			
			/* Modifier la couleur du texte, et envoyer la nouvelle couleur au
			 * au modèle.
			 * Cette opération modifie l'état du modèle et déclenche 
			 * l'activation du patron observer.
			 */
			Color nouvelleCouleur;
			Color couleurActuelle = monModele.getLaCouleur();
			
			if (couleurActuelle == Color.BLACK) {
				nouvelleCouleur = Color.GREEN;
			}
			else if 	(couleurActuelle == Color.GREEN) {
				nouvelleCouleur = Color.YELLOW;
			}
			else if 	(couleurActuelle == Color.YELLOW) {
				nouvelleCouleur = Color.RED;
			}
			else {
				nouvelleCouleur = Color.BLACK;
			}
			
			monModele.setLaCouleur(nouvelleCouleur);
			
		}
	}
	
	/*
	 * Prendre le texte de la vue de ce controleur et l'envoyer au modèle.
	 * Cette action devrait activer le patron observer à cause de l'appel
	 * à setLeTexte(). L'activation du parton abserver va déclencher l'appel
	 * de la méthode update() de tous les observateurs qui se sont enregistrés
	 * auprès du modèle.
	 */
	private void rafraichirTexte() {
		String texte = maVue.getLeTexte();
		monModele.setLeTexte(texte);		
	}
}
