package Decorateur.Pizza;

import Decorateur.Repas.IIngredient;
import Decorateur.Repas.DecorateurIngredient;

public class Mozzarella extends DecorateurIngredient {

	public Mozzarella(IIngredient newPizza, Double cost, String description) {
		super(newPizza, cost, description);
		System.out.println("Adding Mozarella");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza and adds " mozzarella" to it
	
	public String getDescription(){
		return getiIngredient().getDescription() + ", " + super.getDescription();
		
	}
	
	public Double getCost(){
		
		System.out.println("Cost of Moz: " + super.getCost());
		
		return getiIngredient().getCost() + super.getCost();
		
	}
	
}