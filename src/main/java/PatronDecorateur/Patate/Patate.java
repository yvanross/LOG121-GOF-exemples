package PatronDecorateur.Patate;

import PatronDecorateur.Repas.IIngredient;

public class Patate implements IIngredient {
  private Double cost = 0.0;
  private String description="";

  public Patate(double cost, String description) {
    this.cost = cost;
    this.description = description;
  }

  public double getCost() {
    return cost;
  }

  public String getDescription() {
    return description;
  }

}
