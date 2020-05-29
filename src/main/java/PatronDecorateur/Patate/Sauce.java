package PatronDecorateur.Patate;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.DecorateurIngredient;

public class Sauce extends DecorateurIngredient {

  public Sauce(IIngredient ingredient, double cost, String description) {
    super(ingredient,cost,description);
    System.out.println("Add sauce");
  }
  

@Override
  public String getDescription() {
    return getiIngredient().getDescription() + ", " + super.getDescription();
  }
  
  @Override
  public Double getCost() {
    return getiIngredient().getCost() + super.getCost();
  }

}
