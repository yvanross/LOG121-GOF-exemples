package Composite.rabais;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Strategie.Rabais.*;

public class CompositeBestForStore implements IStrategyRabais {
    private final List<IStrategyRabais> rabais = new ArrayList<IStrategyRabais>();
  
    public void add(IStrategyRabais rabais){
      this.rabais.add(rabais);
    }
    @Override
    public Double getCost(Vente vente) {
      Double saleCost = 0.0;  
      final Iterator<IStrategyRabais> iterator = rabais.iterator();
      while(iterator.hasNext()){
        saleCost = Math.max(saleCost,iterator.next().getCost(vente));
      }
      
      return saleCost;
    }
  
  

}
