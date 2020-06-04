package Composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import Composite.rabais.CompositeBestForCustomer;
import Composite.rabais.CompositeBestForStore;
import Composite.rabais.StrategieMinimumCost;
import Decorateur.Pizza.PlainPizza;
import Decorateur.Repas.Repas;
import Strategie.Rabais.StrategiePourcentageRemise;
import Strategie.Rabais.StrategieRemiseAPartirDe;

public class RabaisTest {

  @Test
  public void strategiePourcentageRemise(){

    Repas repas = new Repas();
    repas.add(new PlainPizza());
    assertEquals(4.0,repas.getCost(), 0.001);

    StrategiePourcentageRemise strategiePourcentageRemise = new StrategiePourcentageRemise(repas, 0.1);
    assertEquals(3.6,strategiePourcentageRemise.getCost(),0.001);
    
    StrategieRemiseAPartirDe strategieRemiseAPartirDe = new StrategieRemiseAPartirDe(repas,1.0,3.0);
    assertEquals(3.0,strategieRemiseAPartirDe.getCost(),0.001);

    StrategieRemiseAPartirDe strategieRemiseAPartirDe5 = new StrategieRemiseAPartirDe(repas,1.0,5.0);
    assertEquals(4.0,strategieRemiseAPartirDe5.getCost(),0.001);

    CompositeBestForCustomer compositeBestForCustomer = new CompositeBestForCustomer();
    compositeBestForCustomer.add(strategiePourcentageRemise);
    compositeBestForCustomer.add(strategieRemiseAPartirDe);
    assertEquals(3.0,compositeBestForCustomer.getCost(),0.001);

    CompositeBestForStore compositeBestForStore = new CompositeBestForStore();
    compositeBestForStore.add(strategiePourcentageRemise);
    compositeBestForStore.add(strategieRemiseAPartirDe);
    assertEquals(3.6,compositeBestForStore.getCost(),0.001);
  
    CompositeBestForCustomer compositeBestForCustomer2 = new CompositeBestForCustomer();
    compositeBestForCustomer2.add(compositeBestForStore);
    compositeBestForCustomer2.add(strategieRemiseAPartirDe);
    assertEquals(3.0,compositeBestForCustomer2.getCost(),0.001);

    StrategieMinimumCost strategieMinimumCost = new StrategieMinimumCost(strategiePourcentageRemise,strategieRemiseAPartirDe);
    assertEquals(3,strategieMinimumCost.getCost(),0.001);

  }

  @Test
  public void strategiePourcentageRemiseAssertParamValid(){
    Repas repas = new Repas();
    try{
    StrategiePourcentageRemise strategiePourcentageRemise = new StrategiePourcentageRemise(repas, 0.5);
    } catch(AssertionError error){
      assertTrue(false);
    }
  } 
  
  @Test
  public void strategiePourcentageRemiseAssertParamPositive(){
    Repas repas = new Repas();
    try{
    StrategiePourcentageRemise strategiePourcentageRemise = new StrategiePourcentageRemise(repas, 10.0);
   fail(); // should never be called

    } catch(AssertionError error){
      assertEquals("Parameter should be smaller or equal to 1",error.getMessage());
    }
  }

  @Test
  public void strategiePourcentageRemiseAssertParamNegative(){
    Repas repas = new Repas();
    try{
    StrategiePourcentageRemise strategiePourcentageRemise = new StrategiePourcentageRemise(repas, -1.0);
    fail(); // should never be called
    } catch(AssertionError error){
      assertEquals("Parameter should be greater or equal to 0",error.getMessage());
    }
  }  

  
}