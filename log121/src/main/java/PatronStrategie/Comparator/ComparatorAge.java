package PatronStrategie.Comparator;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorAge implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		LocalDate ld1 = o1.getDateNaissance();
		LocalDate ld2 = o2.getDateNaissance();		
		return ld1.compareTo(ld2);
	}
}	
