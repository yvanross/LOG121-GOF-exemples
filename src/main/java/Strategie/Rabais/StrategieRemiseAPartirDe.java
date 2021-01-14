package Strategie.Rabais;


public class StrategieRemiseAPartirDe implements IStrategyRabais {

  private IStrategyRabais strategyRabais = null;
  private Double rabais = 0.0;
  private Double aPartirDe = 0.0;

  public StrategieRemiseAPartirDe(IStrategyRabais strategyRabais, Double rabais, Double aPartirDe){
    this.strategyRabais = strategyRabais;
    this.rabais = rabais;
    this.aPartirDe = aPartirDe;
  }

  public Double getCost(){
    Double cost = this.strategyRabais.getCost();
    if(cost >= aPartirDe)
      cost = cost - rabais;
    return cost;
  }

}
