package PatronDecorateur.Coffee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoffeeTest {
    public static void printInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }

    @Test
    public void coffeeTest() {
        Coffee c = new SimpleCoffee();
        assertEquals(1.0,c.getCost(),0.001);
        assertEquals("Coffee",c.getIngredients());

        c = new WithMilk(c);
        assertEquals(1.5,c.getCost(),0.001);
        assertEquals("Coffee, Milk",c.getIngredients());

        c = new WithSprinkles(c);
        assertEquals(1.7,c.getCost(),0.001);
        assertEquals("Coffee, Milk, Sprinkles",c.getIngredients());
    }
}