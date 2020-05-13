package PatronDecorateur.Pizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PizzaTest {

    @Test
    public void pizzaTest(){
        
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        
        Pizza pizza = new PlainPizza();
        assertEquals(4.0,pizza.getCost(),0.001);
        assertEquals("Thin dough", pizza.getDescription());

        pizza = new Mozzarella(pizza);
        assertEquals(4.5,pizza.getCost(),0.001);
        assertEquals("Thin dough, mozzarella", pizza.getDescription());

        pizza = new TomatoSauce(pizza);
        assertEquals(4.85,pizza.getCost(),0.001);
        assertEquals("Thin dough, mozzarella, tomato sauce", pizza.getDescription());
            
        
    }

}