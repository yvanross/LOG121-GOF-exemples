package Strategie.Rabais;

public class StrategieRemiseAPartirDe implements IStrategyRabais {

  private Double rabais = 0.0;
  private Double aPartirDe = 0.0;

  public StrategieRemiseAPartirDe(Double rabais, Double aPartirDe){
    this.rabais = rabais;
    this.aPartirDe = aPartirDe;
  }

  public Double getCost(Vente vente){
    Double cost =vente.prixAvantRabais();
    if(cost >= aPartirDe)
      cost = cost - rabais;
    return cost;
  }

}
