package Visiteur.TreeElement;


public class VisiteurTrouveFichier implements Visitor {
	String list = "";
	String nomRecherche;
	int compteur;
	
	public VisiteurTrouveFichier(final String nr) {
		nomRecherche = nr;
	}

	@Override
	public void visit(final Fichier fichier) {
		if (fichier.nom.toString().contains(nomRecherche)) {
			;
			list += "\n" + fichier.nom;
			compteur++;
		}
	}

	@Override
	public void visit(final Repertoire repertoire) {
	}
	
	public int getCompteur() { return compteur; }

	public String list(){
		return list;
	}

}
