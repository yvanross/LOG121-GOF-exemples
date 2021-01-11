package Decorateur.Repas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Strategie.Rabais.IStrategyRabais;


public class Repas implements IStrategyRabais{

  List<IIngredient> lstIngredient = new ArrayList<IIngredient>();
	public void add(IIngredient pizza) {
    lstIngredient.add(pizza);
  }
	public Double getCost() {
    double totalCost=0;
    Iterator<IIngredient> iterator = lstIngredient.iterator();
    while(iterator.hasNext()){
      IIngredient ingredient = iterator.next();
      totalCost += ingredient.getCost();
    }
		return totalCost;
	}
  

}
