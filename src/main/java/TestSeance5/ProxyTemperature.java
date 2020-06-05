package TestSeance5;

public class ProxyTemperature implements ITemperature {
  Double recorded_fahrenheit = null;
  Double recorded_celcius = null;
  ITemperature realObject = null;


  public ProxyTemperature(ITemperature realObject){
    this.realObject = realObject;
  }
  @Override
  public Double fahrenheit() {
    if (recorded_fahrenheit == null)
      recorded_fahrenheit = realObject.fahrenheit();
    return recorded_fahrenheit;
  }

  @Override
  public Double celcius() {
    if (recorded_celcius == null)
    recorded_celcius = realObject.celcius();
    return recorded_celcius;
  }

  
}