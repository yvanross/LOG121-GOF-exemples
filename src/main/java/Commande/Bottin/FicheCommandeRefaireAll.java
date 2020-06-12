package Commande.Bottin;

public class FicheCommandeRefaireAll extends AbstractCommand {

  private GestionnaireDeCommandes gdc = null;

	public FicheCommandeRefaireAll(GestionnaireDeCommandes gdc) {
    this.gdc = gdc;
	}

	@Override
	public boolean faire() {
    gdc.refaireAll();
		return false;
	}

}
