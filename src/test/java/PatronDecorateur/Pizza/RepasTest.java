package PatronDecorateur.Pizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import PatronDecorateur.Coffee.SimpleCoffee;
import PatronDecorateur.Coffee.WithMilk;
import PatronDecorateur.Patate.Patate;
import PatronDecorateur.Patate.Sauce;
import PatronDecorateur.Repas.IIngredient;

public class RepasTest
 {

    @Test
    public void repasTest(){
      
        IIngredient pizza = (IIngredient) new ThreeCheesePizza(10.5, "Pizza");
        assertEquals(10.5, pizza.getCost(),0.001);

        pizza = (IIngredient) new Mozzarella(pizza, 0.5, "with Mozzarella");
        assertEquals(11,pizza.getCost(),0.001);;

         IIngredient coffe = (IIngredient) new SimpleCoffee(1.0, "Coffee");
        assertEquals(1.0,coffe.getCost(),0.001);
        assertEquals("Coffee",coffe.getDescription());

        coffe = new WithMilk(coffe,0.5,"Milk");
        assertEquals(1.5,coffe.getCost(),0.001);
        assertEquals("Coffee, Milk",coffe.getDescription());

       IIngredient patate = new Patate(3.55, "Patates du lac St-Jean");
       assertEquals(3.55, patate.getCost(),0.001);
       assertEquals("Patages du lac St-Jean", patate.getDescription());

       patate = new Sauce(patate,0.45,"avec sauce brune");
       assertEquals(4.0, patate.getCost(),0.001);
       assertEquals("Patages du lac St-Jean avec sauce brune", patate.getDescription());
    }
}