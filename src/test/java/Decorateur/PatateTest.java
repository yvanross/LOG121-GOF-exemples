package Decorateur;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Decorateur.Patate.*;

public class PatateTest {

    @Test
    public void patateTest(){
        
        // The PlainPatate object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        
        IPatate patate = new Patate(4.0, "Patate frite");
        assertEquals(4.0,patate.getCost(),0.001);
        assertEquals("Patate frite", patate.getDescription());

        patate = new Sauce(patate);
        assertEquals(4.5,patate.getCost(),0.001);
        assertEquals("Patate frite, sauce", patate.getDescription());

        patate = new Fromage(patate);
        assertEquals(4.85,patate.getCost(),0.001);
        assertEquals("Patate frite, sauce, fromage", patate.getDescription());
    }


    @Test
    public void Patate2Fromage(){
        IPatate patate = new Patate(5.0, "Patate greque");
        assertEquals(5, patate.getCost(),0.001);

        patate = new Fromage(new Fromage(patate));
        assertEquals(5.70,patate.getCost(),0.001);
        assertEquals("Patate greque, fromage, fromage",patate.getDescription());
    }
}