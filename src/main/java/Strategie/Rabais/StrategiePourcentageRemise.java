package Strategie.Rabais;


public class StrategiePourcentageRemise implements IRabais {
  
  private IRabais repas = null;
  private Double pourcentageRemise = 0.0;

  public StrategiePourcentageRemise(IRabais repas, Double pourcentageRemise){
    assert(pourcentageRemise >= 0): "Parameter should be greater or equal to 0";
    assert(pourcentageRemise <= 1) : "Parameter should be smaller or equal to 1";
    this.pourcentageRemise = pourcentageRemise;
    this.repas = repas;
  }

  public Double getCost(){
    Double cost = this.repas.getCost();
    return cost  - (cost * this.pourcentageRemise);
  }

}
