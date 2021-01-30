package Strategie.Rabais;

public class StrategiePrixOriginal implements IStrategyRabais {

  public Double getCost(Vente vente){
    return  vente.prixAvantRabais();
  }
}
