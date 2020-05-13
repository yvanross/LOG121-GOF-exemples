package PatronStrategie.Comparator;

import java.util.Comparator;

public class ComparatorNomInverse implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		String p1 = o1.getNom();
		String p2 = o2.getNom();		
		return p2.compareTo(p1);
	}
}