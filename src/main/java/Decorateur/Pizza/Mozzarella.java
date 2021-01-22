package Decorateur.Pizza;


public class Mozzarella extends PizzaDecorator {

	public Mozzarella(IPizza newPizza) {
		super(newPizza);
		System.out.println("Adding Mozarella");
	}
	
	public String getDescription(){
		return super.getDescription() + ", mozzarella";
		
	}
	
	public Double getCost(){
		
		System.out.println("Cost of Moz: " + super.getCost());
		
		return super.getCost() + 0.5;
		
	}
	
}