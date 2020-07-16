package Visiteur.TreeElement;

import java.io.File;

public abstract class Noeud {
	
	File nom;
	
	public Noeud(final File nom) {
		this.nom = nom;
	}
	
	public abstract void accept(Visitor v);
}