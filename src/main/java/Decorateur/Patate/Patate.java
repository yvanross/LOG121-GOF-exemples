package Decorateur.Patate;


public class Patate implements IPatate {
  private Double cost = 0.0;
  private String description="";

  public Patate(Double cost, String description) {
    this.cost = cost;
    this.description = description;
  }

  public Double getCost() {
    return cost;
  }

  public String getDescription() {
    return description;
  }

}
