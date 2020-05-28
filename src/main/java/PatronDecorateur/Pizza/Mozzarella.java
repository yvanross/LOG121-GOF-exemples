package PatronDecorateur.Pizza;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.Ingredient;

public class Mozzarella extends Ingredient {

	public Mozzarella(IIngredient newPizza, Double cost, String description) {
		super(newPizza, cost, description);
		System.out.println("Adding Mozarella");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza and adds " mozzarella" to it
	
	public String getDescription(){
		return super.getDescription() + ", " + this.getDescription();
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of Moz: " + this.getCost());
		
		return super.getCost() + this.getCost();
		
	}
	
}