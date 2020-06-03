package Composite.rabais;

import Strategie.Rabais.IRabais;

public class StrategieMinimumCost implements IRabais {
  private IRabais rabais1 = null;
  private IRabais rabais2 = null;

  public StrategieMinimumCost(IRabais rabais1, IRabais rabais2){
    this.rabais1 = rabais1;
    this.rabais2 = rabais2;
  }

  public Double getCost(){
    return Math.min(rabais1.getCost(), rabais2.getCost());
  }

}
