package Visiteur.TreeElement;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repertoire extends Noeud {
	
	private List<Noeud> enfants;

	public Repertoire(File nom) {
		super(nom);
		enfants = new ArrayList<Noeud>();
		getEnfants();
	}
	
	private void getEnfants() {
		Noeud noeud;
		
		for (File file : nom.listFiles()) {
			if (file.isDirectory()) {
				noeud = new Repertoire(file);
			}
			else {
				noeud = new Fichier(file);
			}
			enfants.add(noeud);
		}
	}
	
	public void accept (Visitor v) {
		Iterator<Noeud> i = enfants.iterator();
		v.visit(this);
		while (i.hasNext()) {
			i.next().accept(v);
		}
	}
}
