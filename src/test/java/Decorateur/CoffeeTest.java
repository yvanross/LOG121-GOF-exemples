package Decorateur;

import Decorateur.Coffee.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoffeeTest {
    public static void printInfo(ICoffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getDescription());
    }

    @Test
    public void coffeeTest() {
        ICoffee c = (ICoffee) new SimpleCoffee(1.0, "Coffee");
        assertEquals(1.0,c.getCost(),0.001);
        assertEquals("Coffee",c.getDescription());

        c = (ICoffee) new WithMilk(c);
        assertEquals(1.5,c.getCost(),0.001);
        assertEquals("Coffee, with milk",c.getDescription());

        c = (ICoffee) new WithMilk(c);
        assertEquals(2,c.getCost(),0.001);
        assertEquals("Coffee, with milk, with milk",c.getDescription());

        c = new WithSprinkles(c);
        assertEquals(2.2,c.getCost(),0.001);
        assertEquals("Coffee, with milk, with milk, with sprinkles",c.getDescription());
   

        c = new WithSprinkles(new WithMilk(new SimpleCoffee(1.0, "Coffee")));
        assertEquals(1.7,c.getCost(),0.001);
        assertEquals("Coffee, with milk, with sprinkles",c.getDescription());

    }
}