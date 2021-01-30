package Strategie.Rabais;


public class StrategiePourcentageRemise implements IStrategyRabais {
  
  private Double pourcentageRemise = 0.0;

  public StrategiePourcentageRemise( Double pourcentageRemise){
    assert(pourcentageRemise >= 0): "Parameter should be greater or equal to 0";
    assert(pourcentageRemise <= 1) : "Parameter should be smaller or equal to 1";
    this.pourcentageRemise = pourcentageRemise;
  }

  public Double getCost(Vente vente){
    Double cost = vente.prixAvantRabais();
    return cost  - (cost * this.pourcentageRemise);
  }

}
