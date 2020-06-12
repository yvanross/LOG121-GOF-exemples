package Commande.Bottin;

public class FicheCommandeDefaire extends AbstractCommand {

	private GestionnaireDeCommandes gdc = null;

	public FicheCommandeDefaire(GestionnaireDeCommandes gdc) {
		this.gdc = gdc;
	}

	@Override
	public boolean faire() {
		gdc.defaire();
		return false;
	}

}
