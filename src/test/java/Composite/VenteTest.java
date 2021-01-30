package Composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import Composite.rabais.*;
import Strategie.Rabais.*;

public class VenteTest {

  @Test
  public void venteTest(){

    Vente vente = new Vente( 4.0);
    assertEquals(4.0,vente.getCost(), 0.001);

    StrategiePourcentageRemise strategiePourcentageRemise = new StrategiePourcentageRemise( 0.1);
    vente.setStrategyRabais(strategiePourcentageRemise);
    assertEquals(3.6,vente.getCost(),0.001);
    
    StrategieRemiseAPartirDe strategieRemiseAPartirDe = new StrategieRemiseAPartirDe(1.0,3.0);
    vente.setStrategyRabais(strategieRemiseAPartirDe);
    assertEquals(3.0,vente.getCost(),0.001);

    StrategieRemiseAPartirDe strategieRemiseAPartirDe5 = new StrategieRemiseAPartirDe(1.0,5.0);
    vente.setStrategyRabais(strategieRemiseAPartirDe5);
    assertEquals(4.0,vente.getCost(),0.001);

    CompositeBestForCustomer compositeBestForCustomer = new CompositeBestForCustomer();
    compositeBestForCustomer.add(strategiePourcentageRemise);
    compositeBestForCustomer.add(strategieRemiseAPartirDe);
    vente.setStrategyRabais(compositeBestForCustomer);
    assertEquals(3.0,vente.getCost(),0.001);

    CompositeBestForStore compositeBestForStore = new CompositeBestForStore();
    compositeBestForStore.add(strategiePourcentageRemise);
    compositeBestForStore.add(strategieRemiseAPartirDe);
    vente.setStrategyRabais(compositeBestForStore);
    assertEquals(3.6,vente.getCost(),0.001);
  
    CompositeBestForCustomer compositeBestForCustomer2 = new CompositeBestForCustomer();
    compositeBestForCustomer2.add(compositeBestForStore);
    compositeBestForCustomer2.add(strategieRemiseAPartirDe);
    vente.setStrategyRabais(compositeBestForCustomer2);
    assertEquals(3.0,vente.getCost(),0.001);

    CompositeMinimumCost strategieMinimumCost = new CompositeMinimumCost(strategiePourcentageRemise,strategieRemiseAPartirDe);
    vente.setStrategyRabais(strategieMinimumCost);
    assertEquals(3,vente.getCost(),0.001);
   
    CompositeMinimumCost strategieMinimumCost2 = new CompositeMinimumCost(compositeBestForCustomer,compositeBestForStore);
    vente.setStrategyRabais(strategieMinimumCost2);
    assertEquals(3,vente.getCost(),0.001);

  }

  @Test
  public void strategiePourcentageRemiseAssertParamValid(){
    Vente vente = new Vente(0.5);
    vente.setStrategyRabais(new StrategiePourcentageRemise( 0.5));
   assertTrue(true);
  } 
  
  @Test(expected=AssertionError.class)
  public void strategiePourcentageRemiseAssertParamPositive2(){
    Vente vente = new Vente(10.0);
    vente.setStrategyRabais( new StrategiePourcentageRemise( 10.0));
    fail(); // should never be called
  }

  @Test
    public void strategiePourcentageRemiseAssertParamPositive(){
    try{
      new StrategiePourcentageRemise(10.0);
     fail(); // should never be called
    } catch(AssertionError error){
      assertEquals("Parameter should be smaller or equal to 1",error.getMessage());
    }
  }

  @Test
  public void strategiePourcentageRemiseAssertParamNegative(){
    try{
    new StrategiePourcentageRemise( -1.0);
    fail(); // should never be called
    } catch(AssertionError error){
      assertEquals("Parameter should be greater or equal to 0",error.getMessage());
    }
  }  

  
}