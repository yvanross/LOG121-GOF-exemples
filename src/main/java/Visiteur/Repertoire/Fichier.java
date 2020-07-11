package Visiteur.Repertoire;

import java.io.File;

public class Fichier extends Noeud {
	
	public Fichier(final File nom) {
		super(nom);
	}

	public void accept(final Visitor v) {
		v.visit(this);
	}
}
