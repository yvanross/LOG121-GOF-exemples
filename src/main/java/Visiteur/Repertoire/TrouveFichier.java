package Visiteur.Repertoire;


public class TrouveFichier implements Visitor {
	String list = "";
	String nomRecherche;
	int compteur;
	
	public TrouveFichier(String nr) {
		nomRecherche = nr;
	}
	
	@Override
	public void visit(Fichier fichier) {
		if (fichier.nom.toString().contains(nomRecherche)){;
		list += "\n"+fichier.nom;
		compteur++;	
		}
	}

	@Override
	public void visit(Repertoire repertoire) {		
	}
	
	public int getCompteur() { return compteur; }

	public String list(){
		return list;
	}

}
