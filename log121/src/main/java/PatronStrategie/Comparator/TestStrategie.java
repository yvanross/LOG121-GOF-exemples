package PatronStrategie.Comparator;

public class TestStrategie {
	public static void main(String[] args) {
		
		System.out.println("Utilisation de la Strategie 'AgeCompararator'");
		Compagnie compagnie = new Compagnie(new ComparatorAge());
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
		
	}
}
