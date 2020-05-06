package PatronStrategie.Comparator;

import java.util.Comparator;

public class ComparatorPrenom implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		String p1 = o1.getPrenom();
		String p2 = o2.getPrenom();		
		return p1.compareTo(p2);
	}
}