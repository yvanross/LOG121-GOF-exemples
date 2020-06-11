package Commande.Bottin;

public class FicheCommandeDetruire implements Commande {

	private int index;
	private Fiche ficheOriginale = null;
	private Bottin bottin;
	
	public FicheCommandeDetruire(Bottin bottin, int index) {
		this.bottin = bottin;
		this.index = index;
	}

	public boolean faire() {
		ficheOriginale = new Fiche(bottin.get(index));
		bottin.remove(index);
		return true;
	}

	public void defaire() { 
		bottin.insertElementAt(ficheOriginale, index);
	}

	public void refaire() {
		bottin.remove(index);
	}
}
