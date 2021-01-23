package Decorateur.Pizza;


// By going this route I'll have to create a new subclass
// for an infinite number of pizza.
// I'd also have to change prices in many classes 
// when just 1 Pizza topping cost changes

// Inheritance is static while composition is dynamic
// Through composition I'll be able to add new functionality
// by writing new code rather than by changing current code

public class ThreeCheesePizza implements IPizza {
	 private	Double cost = 0.0;
	 private String description = "";

	public ThreeCheesePizza(Double cost, String description) {
		this.cost = cost;
		this.description = description;
	}
	public Double getCost() {
		return cost;
	}
	public String getDescription() {
		return description;
	}
}