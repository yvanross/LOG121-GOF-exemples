package Seance5;
// import java.util.Random;

public class Temperature implements ITemperature{

  public Double fahrenheit() {
    double random =  Math.random();
		return 40.0 + 40 * random;
	}

	public Double celcius() {
		return fahrenheit2celcius(fahrenheit());
  }
  
  private Double fahrenheit2celcius(Double fahrenheit){
    return (fahrenheit - 32) * 5/9;
  }

}
