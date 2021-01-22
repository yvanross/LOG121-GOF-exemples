package Decorateur;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Decorateur.Pizza.*;

public class PizzaTest {

    @Test
    public void pizzaTest(){
        
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        
        IPizza pizza = new PlainPizza();
        assertEquals(4.0,pizza.getCost(),0.001);
        assertEquals("Thin dough", pizza.getDescription());

        pizza = new Mozzarella(pizza);
        assertEquals(4.5,pizza.getCost(),0.001);
        assertEquals("Thin dough, mozzarella", pizza.getDescription());

        pizza = new TomatoSauce(pizza);
        assertEquals(4.85,pizza.getCost(),0.001);
        assertEquals("Thin dough, mozzarella, tomato sauce", pizza.getDescription());
    }


    @Test
    public void pizza3cheeses(){
        IPizza pizza = new ThreeCheesePizza(10.5, "Three cheese pizza");
        assertEquals(10.5, pizza.getCost(),0.001);

        pizza = new Mozzarella(pizza);
        assertEquals(11,pizza.getCost(),0.001);;
    }
}