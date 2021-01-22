package Decorateur.Pizza;


// Abstract decorator class - note that it implements Pizza interface
public class PizzaDecorator implements IPizza {
    private final IPizza decoratedPizza;

    public PizzaDecorator(IPizza c) {
        this.decoratedPizza = c;
    }

    @Override
    public Double getCost() { // Implementing methods of the interface
        return decoratedPizza.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }
}