package Visiteur.Taxes;

class Liquor implements Visitable {
	
	private final double price;

	Liquor(final double item) {
		price = item;
	}

	public double accept(final Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
	
}