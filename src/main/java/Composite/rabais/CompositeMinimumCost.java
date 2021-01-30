package Composite.rabais;

import Strategie.Rabais.*;

public class CompositeMinimumCost implements IStrategyRabais {
  private IStrategyRabais rabais1 = null;
  private IStrategyRabais rabais2 = null;

  public CompositeMinimumCost(IStrategyRabais rabais1, IStrategyRabais rabais2){
    this.rabais1 = rabais1;
    this.rabais2 = rabais2;
  }

  public Double getCost(Vente vente){
    return Math.min(rabais1.getCost(vente), rabais2.getCost(vente));
  }

}
