package PatronStrategie.Comparator;

import java.time.LocalDate;

public class TestStrategie {
	public static void main(String[] args) {
		
		System.out.println("Utilisation de la Strategie 'AgeCompararator'");
		Compagny compagnie = new Compagny(new ComparatorAge());
		compagnie.add_employe(new Employe("Gendron", "Yves",     LocalDate.of(1990, 10, 18), LocalDate.of(2015,  2, 28),  40000.0));
		compagnie.add_employe(new Employe("Beaupre", "Remi",     LocalDate.of(1991,  3, 24), LocalDate.of(2014,  5, 10),  45000.0));
		compagnie.add_employe(new Employe("Chahby", "Yacine",    LocalDate.of(1967,  1, 11), LocalDate.of(1990,  1,  1), 150000.0));
		compagnie.add_employe(new Employe("El Ayadi", "Azedine", LocalDate.of(1987,  5,  3), LocalDate.of(2010,  9, 22),  70000.0));
		compagnie.add_employe(new Employe("Michaud", "Eve",      LocalDate.of(1988, 12, 31), LocalDate.of(2016, 12,  1),  55000.0));
		compagnie.add_employe(new Employe("Jean", "Hector",      LocalDate.of(1993,  6, 28), LocalDate.of(2015, 10, 10),  42000.0));
		compagnie.add_employe(new Employe("Tremblay", "Lea",     LocalDate.of(1990,  4,  3), LocalDate.of(2015,  6, 13),  56000.0));		

		System.out.println(compagnie.toString());
		
		System.out.println();
		System.out.println("Utilisation de la Strategie 'SalaireComparator'");
		compagnie.setComparatorStrategy(new ComparatorSalaire());
		System.out.println(compagnie.toString());
		
		System.out.println("Utilisation de la Strategie 'PrenomComparator'");
		compagnie.setComparatorStrategy(new ComparatorPrenom());
		System.out.println(compagnie.toString());
		
		System.out.println("Utilisation de la Strategie 'EmbaucheComparator'");
		compagnie.setComparatorStrategy(new ComparatorEmbauche());
		System.out.println(compagnie.toString());

		System.out.println("Utilisation de la Strategie 'ComparatorNomInvese'");
		compagnie.setComparatorStrategy(new ComparatorNomInverse());
		System.out.println(compagnie.toString());
		
	}
}
