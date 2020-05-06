package PatronStrategieComparator;

public class TestStrategie {
	public static void main(String[] args) {
		
		System.out.println("Utilisation de la Strategie 'AgeCompararator'");
		Compagnie compagnie = new Compagnie(new AgeComparator());
		System.out.println(compagnie.toString());
		
		System.out.println();
		System.out.println("Utilisation de la Strategie 'SalaireComparator'");
		compagnie.setComparatorStrategy(new SalaireComparator());
		System.out.println(compagnie.toString());
		
		System.out.println("Utilisation de la Strategie 'PrenomComparator'");
		compagnie.setComparatorStrategy(new PrenomComparateur());
		System.out.println(compagnie.toString());
		
		System.out.println("Utilisation de la Strategie 'EmbaucheComparator'");
		compagnie.setComparatorStrategy(new EmbaucheComparator());
		System.out.println(compagnie.toString());
		
	}
}
