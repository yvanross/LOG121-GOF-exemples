package Strategie.Comparator;

import java.util.Comparator;

public class ComparatorNomSalaire implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		int compare = (o1.getNom()).compareTo(o2.getNom());
		 if (compare == 0)
			 compare = Double.compare(o1.getSalaire(),o2.getSalaire());
		return compare;
	}
}