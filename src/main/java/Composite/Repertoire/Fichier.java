package Composite.Repertoire;

import java.io.File;

public class Fichier extends Noeud {
	
	public Fichier(File nom) {
		super(nom);
	}
	
	public String toString() {
		return addSpace() + "F: " + nom.toString() + System.lineSeparator();
	}
}
