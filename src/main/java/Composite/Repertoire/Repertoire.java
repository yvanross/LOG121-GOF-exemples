package Composite.Repertoire;

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
	
	public String toString() {
		StringBuffer sb = new StringBuffer();;
		Iterator<Noeud> i = enfants.iterator();

		// ajouter le nom du répertoire
		sb.append(addSpace() + "R: " + nom.toString() + System.lineSeparator());
		
		niveau++;
		
		// ajouter le nom des enfants
		while (i.hasNext()) {
			sb.append(i.next().toString());
		}
		
		niveau--;
		
		return sb.toString();
	}
}
