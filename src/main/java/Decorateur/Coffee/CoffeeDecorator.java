package Decorateur.Coffee;


// Abstract decorator class - note that it implements Coffee interface
public abstract class CoffeeDecorator implements ICoffee {
    private final ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee c) {
        this.decoratedCoffee = c;
    }

    @Override
    public double getCost() { // Implementing methods of the interface
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}