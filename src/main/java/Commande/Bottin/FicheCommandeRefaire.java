package Commande.Bottin;


public class FicheCommandeRefaire extends AbstractCommand {

	private GestionnaireDeCommandes gdc = null; 

	public FicheCommandeRefaire(GestionnaireDeCommandes gdc) {
		this.gdc = gdc;
	}

	@Override
	public boolean faire() {
		gdc.refaire();
		return false;
	}


}
