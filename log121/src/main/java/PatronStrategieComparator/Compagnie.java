package PatronStrategieComparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Iterator;
import java.util.List;

public class Compagnie {
	
	List<Employe> liste;
	Comparator<Employe> comparateur;	// comparateur est une interface. C'est la "strategie" utilisée par Compagnie.

	// Le constructeur recoit la Stratégie en paramètre
	public Compagnie(Comparator<Employe> comparateur) {
		setComparatorStrategy(comparateur);
		liste = new ArrayList<Employe>();
		
		liste.add(new Employe("Gendron", "Yves",     LocalDate.of(1990, 10, 18), LocalDate.of(2015,  2, 28),  40000.0));
		liste.add(new Employe("Beaupre", "Remi",     LocalDate.of(1991,  3, 24), LocalDate.of(2014,  5, 10),  45000.0));
		liste.add(new Employe("Chahby", "Yacine",    LocalDate.of(1967,  1, 11), LocalDate.of(1990,  1,  1), 150000.0));
		liste.add(new Employe("El Ayadi", "Azedine", LocalDate.of(1987,  5,  3), LocalDate.of(2010,  9, 22),  70000.0));
		liste.add(new Employe("Michaud", "Eve",      LocalDate.of(1988, 12, 31), LocalDate.of(2016, 12,  1),  55000.0));
		liste.add(new Employe("Jean", "Hector",      LocalDate.of(1993,  6, 28), LocalDate.of(2015, 10, 10),  42000.0));
		liste.add(new Employe("Tremblay", "Lea",     LocalDate.of(1990,  4,  3), LocalDate.of(2015,  6, 13),  56000.0));		
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
}
