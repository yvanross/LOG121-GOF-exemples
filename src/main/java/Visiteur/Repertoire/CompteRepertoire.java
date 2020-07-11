package Visiteur.Repertoire;

public class CompteRepertoire implements Visitor {
	private int compteur;
	
	public void visit(Fichier fichier) { }

	public void visit(Repertoire repertoire) {
		compteur++;
	}

	public int getCompteur() {
		return compteur;
	}
}
