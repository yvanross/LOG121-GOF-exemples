package TestSeance5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;



public class TemperatureDecoratorTest {

  @Test
  public void temperatureTest(){

    ITemperatureToDecorate fah = new TemperatureFahrenheit();
    Double temperature = fah.temperature();
    assertNotEquals(temperature, fah.temperature(),0.0001);
  
    TemperatureFahrenheit mockedTemperature = mock(TemperatureFahrenheit.class);

    // define return value for method getUniqueId()
    when(mockedTemperature.temperature()).thenReturn(80.1);
  
    ITemperatureToDecorate temperatureCelcius = new TemperatureCelcius(mockedTemperature);
    assertEquals(26.722222, temperatureCelcius.temperature(),0.01);
    
    System.out.println(mockedTemperature.temperature());
    verify(mockedTemperature, times(2)).temperature();
  }
  
}