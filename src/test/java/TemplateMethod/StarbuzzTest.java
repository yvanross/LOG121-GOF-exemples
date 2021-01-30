package TemplateMethod;

import static org.junit.Assert.assertEquals;
// import org.junit.Before;
import org.junit.Test;
import TemplateMethod.Starbuzz.*;
import Utils.OutStream;



public class StarbuzzTest extends OutStream {
	@Test
	public void preparer_the() throws Exception {
        The the = new The();
       the.preparer();
       assertEquals(
		"L'eau est en train de bouillir" + System.lineSeparator() +
		"Le thé est en train de tremper dans l'eau!" + System.lineSeparator() +
		"Je vous sers dans une tasse" +  System.lineSeparator() +
        "J'ajoute du citron!" + System.lineSeparator()
		,this.getOutput());
    
    }
 
    @Test
	public void preparer_cafe() throws Exception {
        Cafe cafe = new Cafe();
       cafe.preparer();
       assertEquals(
		"L'eau est en train de bouillir" + System.lineSeparator() +
		"Le café est en train d'infuser!" + System.lineSeparator() +
        "Je vous sers dans une tasse" +  System.lineSeparator() +
        "J'ajoute du lait et du sucre!" +  System.lineSeparator()
		,this.getOutput());
    }

    
}


