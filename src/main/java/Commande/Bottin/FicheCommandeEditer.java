package Commande.Bottin;

public class FicheCommandeEditer implements Commande {

	private int index;
	private Fiche ficheOriginale = null;
	private Fiche ficheRetiree = null;
	private Bottin bottin;
	
	public FicheCommandeEditer(Bottin bottin, int index) {
		this.bottin = bottin;
		this.index = index;
	}

	public boolean faire() {
		Fiche fiche = bottin.get(index);
		ficheOriginale = new Fiche(fiche);
		FicheDialog dialog = new FicheDialog(fiche, FicheDialog.Type.EDITER);
		dialog.setVisible(true);
		if (dialog.isOKPressed()) {
			bottin.set(index, dialog.getFiche());
			return true;
		}
		return false;
	}

	public void defaire() { 
		ficheRetiree = bottin.get(index);
		bottin.set(index, ficheOriginale);		
	}

	public void refaire() {
		bottin.set(index, ficheRetiree);
	}
}
