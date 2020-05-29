package PatronDecorateur.Coffee;
import PatronDecorateur.Repas.*;

// Decorator WithMilk mixes milk into coffee.
// Note it extends CoffeeDecorator.
public class WithMilk extends DecorateurIngredient {
    public WithMilk(IIngredient ingredient, double cost, String description) {
        super(ingredient,cost,description);
    }

    @Override
    public Double getCost() { // Overriding methods defined in the abstract superclass
        return getiIngredient().getCost() + super.getCost();
    }

    @Override
    public String getDescription() {
        return getiIngredient().getDescription() + ", " + super.getDescription();
    }
}