package Visiteur.TreeElement;

public interface Visitor {
	public void visit(Fichier fichier);
	public void visit(Repertoire repertoire);
}
