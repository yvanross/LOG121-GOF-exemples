package PatronDecorateur.Coffee;

import PatronDecorateur.Repas.IIngredient;

// Abstract decorator class - note that it implements Coffee interface
public abstract class CoffeeDecorator implements IIngredient {
    private final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee c) {
        this.decoratedCoffee = c;
    }

    @Override
    public Double getCost() { // Implementing methods of the interface
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}