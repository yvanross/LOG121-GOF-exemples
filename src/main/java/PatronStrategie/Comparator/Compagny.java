package PatronStrategie.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compagny {
	
	List<Employe> liste;
	Comparator<Employe> comparateur;	// comparateur est une interface. C'est la "strategie" utilisée par Compagnie.

	// Le constructeur recoit la Stratégie en paramètre
	public Compagny(Comparator<Employe> comparateur) {
		setComparatorStrategy(comparateur);
		liste = new ArrayList<Employe>();
		
	}
	

	// Cette méthode permet de modifier la Stratégie après l'instanciation de l'objet.
	public void setComparatorStrategy(Comparator<Employe> comparateur) {
		this.comparateur = comparateur;		
	}
	
	// toString() utilise la Stratégie.
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(Employe.getEntete());
		
		Collections.sort(liste, comparateur);   // utilisation de la Stratégie.
		
		for (int i = 0; i < liste.size(); i++) {
			sb.append(liste.get(i).toString() + System.lineSeparator());
		}
		return sb.toString();
	}


	public void add_employe(Employe employe) {
		liste.add(employe);
	}
}
