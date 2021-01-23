package Decorateur.Patate;


public class Fromage extends PatateDecorator {

  public Fromage(IPatate patate) {
    super(patate);
    System.out.println("Add sauce");
  }
  

  public String getDescription() {
    return  super.getDescription() + ", fromage";
  }
  
  public Double getCost() {
    return super.getCost() + 0.35;
  }

}
