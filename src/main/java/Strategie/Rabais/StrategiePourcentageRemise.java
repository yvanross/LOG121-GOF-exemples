package Strategie.Rabais;


public class StrategiePourcentageRemise implements IStrategyRabais {
  
  private IStrategyRabais strategyRabais = null;
  private Double pourcentageRemise = 0.0;

  public StrategiePourcentageRemise(IStrategyRabais strategyRabais, Double pourcentageRemise){
    assert(pourcentageRemise >= 0): "Parameter should be greater or equal to 0";
    assert(pourcentageRemise <= 1) : "Parameter should be smaller or equal to 1";
    this.pourcentageRemise = pourcentageRemise;
    this.strategyRabais = strategyRabais;
  }

  public Double getCost(){
    Double cost = this.strategyRabais.getCost();
    return cost  - (cost * this.pourcentageRemise);
  }

}
