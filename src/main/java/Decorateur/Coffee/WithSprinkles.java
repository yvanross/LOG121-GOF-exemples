package Decorateur.Coffee;

import Decorateur.Repas.IIngredient;
import Decorateur.Repas.DecorateurIngredient;

// Decorator WithSprinkles mixes sprinkles onto coffee.
// Note it extends CoffeeDecorator.
public class WithSprinkles extends DecorateurIngredient {
    public WithSprinkles(IIngredient ingredient,Double cost, String description) {
        super(ingredient,cost,description);
    }

    @Override
    public Double getCost() {
        return getiIngredient().getCost() + super.getCost();
    }

    @Override
    public String getDescription() {
        return getiIngredient().getDescription() + ", " + super.getDescription();
    }
}