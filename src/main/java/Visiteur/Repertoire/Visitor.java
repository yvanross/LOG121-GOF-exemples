package Visiteur.Repertoire;

public interface Visitor {
	public void visit(Fichier fichier);
	public void visit(Repertoire repertoire);
}
