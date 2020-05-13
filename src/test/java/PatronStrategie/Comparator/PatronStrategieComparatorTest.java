package PatronStrategie.Comparator;

import org.junit.Before;
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

		ComparatorAge ageComparator = new ComparatorAge();
		assertTrue(ageComparator instanceof java.util.Comparator);
		assertEquals(-1,ageComparator.compare(employe1, employe2));
		assertEquals(1,ageComparator.compare(employe2, employe1));

		ComparatorSalaire salaireComparator = new ComparatorSalaire();
		assertTrue(salaireComparator instanceof java.util.Comparator);
		assertEquals(-1,salaireComparator.compare(employe1, employe2));
		assertEquals(1,salaireComparator.compare(employe2, employe1));
		
		//NomComparator nomCompartor = new NomComparator();
		//assertTrue(nomCompartor instanceof java.util.Comparator);
		//assertEquals(-1,nomCompartor.compare(employe1, employe2));
		//assertEquals(1,nomCompartor.compare(employe2, employe1));

		
	}
	Compagny compagnie;
	
	
	@Before 
	public void initCompagny(){
		compagnie  = new Compagny(new ComparatorAge());
		compagnie.add_employe(new Employe("Gendron", "Yves",     LocalDate.of(1990, 10, 18), LocalDate.of(2015,  2, 28),  40000.0));
		compagnie.add_employe(new Employe("Beaupre", "Remi",     LocalDate.of(1991,  3, 24), LocalDate.of(2014,  5, 10),  45000.0));
		compagnie.add_employe(new Employe("Chahby", "Yacine",    LocalDate.of(1967,  1, 11), LocalDate.of(1990,  1,  1), 150000.0));
		compagnie.add_employe(new Employe("El Ayadi", "Azedine", LocalDate.of(1987,  5,  3), LocalDate.of(2010,  9, 22),  70000.0));
		compagnie.add_employe(new Employe("Michaud", "Eve",      LocalDate.of(1988, 12, 31), LocalDate.of(2016, 12,  1),  55000.0));
		compagnie.add_employe(new Employe("Jean", "Hector",      LocalDate.of(1993,  6, 28), LocalDate.of(2015, 10, 10),  42000.0));
		compagnie.add_employe(new Employe("Tremblay", "Lea",     LocalDate.of(1990,  4,  3), LocalDate.of(2015,  6, 13),  56000.0));		

	}

	@Test
    public void testCompagnieComparator() {
	
		String result = compagnie.toString();
		System.out.println(result);
		
		assertTrue(result.indexOf("150000") < result.indexOf("42000"));

		compagnie.setComparatorStrategy(new ComparatorSalaire());
		result = compagnie.toString();
		assertTrue(result.indexOf("42000") < result.indexOf("150000"));
	
	}

	@Test
	public void testComparateurPrenonNomInverse(){
		compagnie.setComparatorStrategy(new ComparatorNomInverse());
		String result = compagnie.toString();
		// System.out.println(result);
		assertTrue(result.indexOf("Tremblay") < result.indexOf("Michaud"));
		assertTrue(result.indexOf("Michaud") < result.indexOf("Jean"));
		assertTrue(result.indexOf("Jean") < result.indexOf("Gendron"));
		assertTrue(result.indexOf("Gendron") < result.indexOf("El Ayadi"));
		assertTrue(result.indexOf("El Ayadi") < result.indexOf("Chahby"));
		assertTrue(result.indexOf("Chahby") < result.indexOf("Beaupre"));

	}
}
