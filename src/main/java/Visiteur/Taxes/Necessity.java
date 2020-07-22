package Visiteur.Taxes;





class Necessity implements Visitable {
	
	private final double price;

	Necessity(final double item) {
		price = item;
	}

	public double accept(final Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
	
}
