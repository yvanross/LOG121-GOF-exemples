
package Tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactureTest {

  // MGL802 demo TDD
  // pseudo code
  // creéer une vente pour l'entreprise XYZ
  // ajouter des items avec un prix une quantité et une descriptioun
  // ajouter tps 9.975
  // ajouter tvq 5%
  // calculer le total de la vente
  // afficher la facture
  // utilise un mock pour au moins un item
  @Test
  public void getTotalTest() {
    Facture facture = new Facture("XYZ");

    Items items = new Items();
    items.addItem(new Item(1.0, 5, "popsicle")); 
    items.addItem(new Item(2.0, 6, "Cornet Crème galcé"));
    assertEquals(17.0, items.getTotal(),0.001);
   
    facture.addItem(items);

    Taxe tps = new Taxe(items,"tps", 9.975);
    assertEquals(1.6957, tps.getTotal(),0.001);

    Taxe tvq = new Taxe(items, "tvq", 5.0);
     assertEquals(0.85, tvq.getTotal(),0.001);
  
    facture.addItem(tps);
    assertEquals(18.69575, facture.getTotal(),0.001);
   
    facture.addItem(tvq);
    assertEquals(19.54575, facture.getTotal(),0.001);
  }

  @Test
  public void TotalItem(){
    Item item = new Item(1.0, 5, "popsicle");
    assertEquals(5.0,item.getTotal(),0.001);
  }

}