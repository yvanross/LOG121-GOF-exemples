package Visiteur.Taxes;


class Tobacco implements Visitable {
	
	private final double price;

	Tobacco(final double item) {
		price = item;
	}

	public double accept(final Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
	
}


