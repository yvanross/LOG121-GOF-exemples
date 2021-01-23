package Decorateur.Pizza;

public class TomatoSauce extends PizzaDecorator {

	public TomatoSauce(IPizza pizza) {
		super(pizza);
		System.out.println("Adding Sauce");
	}
	
	public String getDescription(){
		return super.getDescription() + ", tomato sauce";
	}
	
	public Double getCost(){
		System.out.println("Cost of Sauce: " + super.getCost());
		return super.getCost() + 0.35;
	}
	
}