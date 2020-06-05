package TestSeance5;

public class TemperatureFahrenheit implements ITemperatureToDecorate {

  public Double temperature(){
    double random =  Math.random();
		return 40.0 + 40 * random; 
  }
}