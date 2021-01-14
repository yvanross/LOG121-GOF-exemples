package Composite.rabais;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Strategie.Rabais.IStrategyRabais;

public class CompositeBestForCustomer implements IStrategyRabais {
  private final List<IStrategyRabais> rabais = new ArrayList<IStrategyRabais>();

  public void add(IStrategyRabais rabais){
    this.rabais.add(rabais);
  }
  @Override
  public Double getCost() {
    Double saleCost = Double.MAX_VALUE;  
    final Iterator<IStrategyRabais> iterator = rabais.iterator();
    while(iterator.hasNext()){
      saleCost = Math.min(saleCost,iterator.next().getCost());
    }
    
		return saleCost;
	}


}
