package Tdd;

public class Item implements ITotal {
	Double prix = 0.0;
	Integer qty = 0;
	String desc = "";

	public Item(double prix, int qty, String desc) {
		this.prix = prix;
		this.qty = qty;
	this.desc = desc;
	}

	public Double getTotal() {
		return this.prix * this.qty;
	}

}
