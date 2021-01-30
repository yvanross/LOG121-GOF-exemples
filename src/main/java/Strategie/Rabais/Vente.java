package Strategie.Rabais;

public class Vente  {
    private IStrategyRabais strategy;
    private double prixAvantRabais;
    
     public Vente(double cost){
         this.prixAvantRabais = cost;
         this.strategy = new StrategiePrixOriginal();
    }

    public Double prixAvantRabais(){
        return this.prixAvantRabais;
    }
    
    public Double getCost() {
        return this.strategy.getCost(this);
    }

    public void setStrategyRabais(IStrategyRabais strategy){
        this.strategy = strategy;
    }
}
