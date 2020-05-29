package PatronDecorateur.Repas;

// Has a "Has a" relationship with Pizza. This is an
// Aggregation Relationship

public abstract class DecorateurIngredient implements IIngredient {
	private Double cost = 0.0;
	private String description = "";
	protected IIngredient iIngredient;
	
	// Assigns the type instance to this attribute
	// of a Pizza
	
	// All decorators can dynamically customize the Pizza
	// instance PlainPizza because of this
	public DecorateurIngredient(IIngredient newIngredient, Double cost, String description){
		this.iIngredient = newIngredient;
		this.cost = cost;
		this.description = description;
	}
	
	public IIngredient getiIngredient() {
		return iIngredient;
	}

	public String getDescription() {
		return this.description;
	}

	public Double getCost() {
		return this.cost;
	}
	
}