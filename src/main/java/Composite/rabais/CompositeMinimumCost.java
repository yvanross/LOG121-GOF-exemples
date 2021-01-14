package Composite.rabais;

import Strategie.Rabais.IStrategyRabais;

public class CompositeMinimumCost implements IStrategyRabais {
  private IStrategyRabais rabais1 = null;
  private IStrategyRabais rabais2 = null;

  public CompositeMinimumCost(IStrategyRabais rabais1, IStrategyRabais rabais2){
    this.rabais1 = rabais1;
    this.rabais2 = rabais2;
  }

  public Double getCost(){
    return Math.min(rabais1.getCost(), rabais2.getCost());
  }

}
