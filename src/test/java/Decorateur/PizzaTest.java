package Decorateur;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Decorateur.Pizza.Mozzarella;
import Decorateur.Pizza.PlainPizza;
import Decorateur.Pizza.ThreeCheesePizza;
import Decorateur.Pizza.TomatoSauce;
import Decorateur.Repas.IIngredient;

public class PizzaTest {

    @Test
    public void pizzaTest(){
        
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        
        IIngredient pizza = new PlainPizza();
        assertEquals(4.0,pizza.getCost(),0.001);
        assertEquals("Thin dough", pizza.getDescription());

        pizza = new Mozzarella(pizza, 0.5, "mozzarella");
        assertEquals(4.5,pizza.getCost(),0.001);
        assertEquals("Thin dough, mozzarella", pizza.getDescription());

        pizza = new TomatoSauce(pizza, 0.35, "tomato sauce");
        assertEquals(4.85,pizza.getCost(),0.001);
        assertEquals("Thin dough, mozzarella, tomato sauce", pizza.getDescription());
    }


    @Test
    public void pizza3cheeses(){
        IIngredient pizza = new ThreeCheesePizza(10.5, "Three cheese pizza");
        assertEquals(10.5, pizza.getCost(),0.001);

        pizza = new Mozzarella(pizza, 0.5, "Mozarrella");
        assertEquals(11,pizza.getCost(),0.001);;
    }
}