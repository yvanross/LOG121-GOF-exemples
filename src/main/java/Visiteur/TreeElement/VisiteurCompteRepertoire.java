package Visiteur.TreeElement;

public class VisiteurCompteRepertoire implements Visitor {
	private int compteur;
	
	public void visit(final Fichier fichier) {
	}

	public void visit(final Repertoire repertoire) {
		compteur++;
	}

	public int getCompteur() {
		return compteur;
	}
}
