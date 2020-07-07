package Tdd;

public class Taxe implements ITotal {
	Double taxe = 0.0;
	ITotal totalisable = null;

	public Taxe(ITotal totalisable, String string, double taxe) {
		this.totalisable = totalisable;
		this.taxe = taxe;
	}

	public Double getTotal() {
		return  totalisable.getTotal() * this.taxe/100 ;
	}

}
