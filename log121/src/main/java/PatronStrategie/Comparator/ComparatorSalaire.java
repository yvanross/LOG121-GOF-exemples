package PatronStrategie.Comparator;

import java.util.Comparator;

public class ComparatorSalaire implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		double s1 = o1.getSalaire();
		double s2 = o2.getSalaire();	
		return Double.compare(s1, s2);
	}
}	

