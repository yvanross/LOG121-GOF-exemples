package Composite.rabais;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Strategie.Rabais.IRabais;

public class CompositeBestForStore implements IRabais {
    private final List<IRabais> rabais = new ArrayList<IRabais>();
  
    public void add(IRabais rabais){
      this.rabais.add(rabais);
    }
    @Override
    public Double getCost() {
      Double saleCost = 0.0;  
      final Iterator<IRabais> iterator = rabais.iterator();
      while(iterator.hasNext()){
        saleCost = Math.max(saleCost,iterator.next().getCost());
      }
      
      return saleCost;
    }
  
  

}
