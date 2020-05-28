package PatronDecorateur.Patate;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.Ingredient;

public class Sauce extends Ingredient {

  public Sauce(IIngredient ingredient, double cost, String description) {
    super(ingredient,cost,description);
    System.out.println("Add sauce");
  }
  

@Override
  public String getDescription() {
    return super.getDescription() + ", " + this.getDescription();
  }
  
  @Override
  public double getCost() {
    return super.getCost() + this.getCost();
  }

}
