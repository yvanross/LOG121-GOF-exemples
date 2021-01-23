package Decorateur.Pizza;

public class PizzaTopping extends PizzaDecorator {
    private Double cost = 0.0;
    private String description = "";

	public PizzaTopping(IPizza pizza, Double cost, String description) {
        super(pizza);
        this.cost = cost;
        this.description = description;
		System.out.println("Add topping of " + description + " for " + cost + "$");
	}
	
	public String getDescription(){
		return super.getDescription() + ", " + this.description;
	}
	
	public Double getCost(){
		return super.getCost() + this.cost;
	}
	
}