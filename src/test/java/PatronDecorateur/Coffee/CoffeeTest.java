package PatronDecorateur.Coffee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import PatronDecorateur.Repas.IIngredient;

public class CoffeeTest {
    public static void printInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getDescription());
    }

    @Test
    public void coffeeTest() {
        IIngredient c = (IIngredient) new SimpleCoffee(1.0, "Coffe");
        assertEquals(1.0,c.getCost(),0.001);
        assertEquals("Coffee",c.getDescription());

        c = new WithMilk(c, 0.5, "Milk");
        assertEquals(1.5,c.getCost(),0.001);
        assertEquals("Coffee, Milk",c.getDescription());

        c = new WithSprinkles(c, 0.2, "Sprinkles");
        assertEquals(1.7,c.getCost(),0.001);
        assertEquals("Coffee, Milk, Sprinkles",c.getDescription());
    }
}