package PatronStrategieComparator;

import java.time.LocalDate;
import java.util.Comparator;

public class EmbaucheComparator implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		LocalDate ld1 = o1.getDateEmbauche();
		LocalDate ld2 = o2.getDateEmbauche();	
		return ld1.compareTo(ld2);
	}
}	
