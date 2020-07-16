package Visiteur.TreeElement;

public class VisiteurListe implements Visitor {
    private StringBuffer sb = new StringBuffer();
	
	public void visit(Fichier fichier) {
		sb.append("F: " + fichier.nom + "\n");
	}

	@Override
	public void visit(Repertoire repertoire) {
		sb.append("R: " + repertoire.nom + "\n");
	}

	public String toString() {
		return sb.toString();
	}
}
