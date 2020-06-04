package Seance5;

public class TemperatureCelcius implements ITemperatureToDecorate {
  ITemperatureToDecorate temperatureToDecorate = null;

  public TemperatureCelcius(ITemperatureToDecorate temperature){
    this.temperatureToDecorate = temperature;
  }

  public Double temperature(){
    return fahrenheit2celcius(temperatureToDecorate.temperature());
  }

  private Double fahrenheit2celcius(Double fahrenheit){
    return (fahrenheit - 32) * 5/9;
  }
}