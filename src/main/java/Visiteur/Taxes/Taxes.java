package Visiteur.Taxes;





interface Visitable {

	// Allows the Visitor to pass the object so
	// the right operations occur on the right 
	// type of object.
	
	// accept() is passed the same visitor object
	// but then the method visit() is called using 
	// the visitor object. The right version of visit()
	// is called because of method overloading
	
	public double accept(Visitor visitor);
	
}

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
