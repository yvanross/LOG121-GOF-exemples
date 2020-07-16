package Visiteur.Taxes;


public class VisitorDemo
 {
	public static void main(final String[] args) {
		
		final TaxVisitor taxCalc = new TaxVisitor();
		final TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		final Necessity milk = new Necessity(3.47);
		final Liquor vodka = new Liquor(11.99);
		final Tobacco cigars = new Tobacco(19.99);
		
		System.out.println( String.valueOf(milk.accept(taxCalc)));
		System.out.println(vodka.accept(taxCalc) );
		System.out.println(cigars.accept(taxCalc));
		
		System.out.println("TAX HOLIDAY PRICES\n");

		System.out.println(milk.accept(taxHolidayCalc));
		System.out.println(vodka.accept(taxHolidayCalc));
		System.out.println(cigars.accept(taxHolidayCalc));

	}
}


