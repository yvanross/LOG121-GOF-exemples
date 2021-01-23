package Decorateur.Patate;
public class Sauce extends PatateDecorator {

  public Sauce(IPatate patate) {
    super(patate);
    System.out.println("Add sauce");
  }
  

  public String getDescription() {
    return  super.getDescription() + ", sauce";
  }
  
  public Double getCost() {
    return super.getCost() + 0.5;
  }

}
