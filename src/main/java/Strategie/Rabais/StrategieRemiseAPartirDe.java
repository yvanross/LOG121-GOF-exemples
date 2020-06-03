package Strategie.Rabais;

import Decorateur.Repas.Repas;

public class StrategieRemiseAPartirDe implements IRabais {

  private IRabais repas = null;
  private Double rabais = 0.0;
  private Double aPartirDe = 0.0;

  public StrategieRemiseAPartirDe(IRabais repas, Double rabais, Double aPartirDe){
    this.repas = repas;
    this.rabais = rabais;
    this.aPartirDe = aPartirDe;
  }

  public Double getCost(){
    Double cost = this.repas.getCost();
    if(cost >= aPartirDe)
      cost = cost - rabais;
    return cost;
  }

}
