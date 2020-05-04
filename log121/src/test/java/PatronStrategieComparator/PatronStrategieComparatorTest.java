package PatronStrategieComparator;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class PatronStrategieComparatorTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testComparators() {

		Employe employe1 = new Employe("Gendron", "Yves",     LocalDate.of(1990, 10, 18), LocalDate.of(2015,  2, 28),  40000.0);
		Employe employe2 = new Employe("Beaupre", "Remi",     LocalDate.of(1991,  3, 24), LocalDate.of(2014,  5, 10),  45000.0);

		AgeComparator ageComparator = new AgeComparator();
		assertTrue(ageComparator instanceof java.util.Comparator);
		assertEquals(-1,ageComparator.compare(employe1, employe2));
		assertEquals(1,ageComparator.compare(employe2, employe1));

		SalaireComparator salaireComparator = new SalaireComparator();
		assertTrue(salaireComparator instanceof java.util.Comparator);
		assertEquals(-1,salaireComparator.compare(employe1, employe2));
		assertEquals(1,salaireComparator.compare(employe2, employe1));
	}
	

	@Test
    public void testCompagnieComparator() {
		Compagnie compagnie = new Compagnie(new AgeComparator());
		String result = compagnie.toString();
		//System.out.println(result);
		assertTrue(result.indexOf("150000") < result.indexOf("42000"));
		compagnie.setComparatorStrategy(new SalaireComparator());
		result = compagnie.toString();
		assertTrue(result.indexOf("42000") < result.indexOf("150000"));
	
	}
}
