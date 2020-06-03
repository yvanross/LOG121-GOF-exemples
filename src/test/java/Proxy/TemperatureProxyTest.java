package Proxy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.*;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TemperatureProxyTest {
  
  @Test
  public void TemperatureFahrenheit(){
    final Temperature temperature = new Temperature();
    final ProxyTemperature proxyTemperature = new ProxyTemperature(temperature);
    final Double fahrenheit = proxyTemperature.fahrenheit();
    assertEquals(fahrenheit, proxyTemperature.fahrenheit());

    final Double expected = (fahrenheit - 32) * 5 / 9;
    final Double celcius = proxyTemperature.celcius();
    assertTrue((expected-celcius) >0.001);
  }

  @Test
  public void temperatureCelcius(){
    ITemperature temperature = new ProxyTemperature(new Temperature());
    Double celcius = temperature.celcius();
    assertEquals(celcius, temperature.celcius());
  }

  @Test
  public void TemperatureMock() {
    //  create mock
    Temperature mockedTemperature = mock(Temperature.class);

    // define return value for method getUniqueId()
    when(mockedTemperature.fahrenheit()).thenReturn(80.1);
    when(mockedTemperature.celcius()).thenReturn(26.66666);

    // use mock in test....
    assertEquals(80.1,mockedTemperature.fahrenheit(),0.001);
    assertEquals(26.666666,mockedTemperature.celcius(),0.01);
  }

  @Test
  public void fahrenheit2celciusTest() throws NoSuchMethodException, SecurityException, IllegalAccessException,
      IllegalArgumentException, InvocationTargetException {
    Temperature temperature = new Temperature();
    Method method = Temperature.class.getDeclaredMethod("fahrenheit2celcius",Double.class);
    method.setAccessible(true);

    Double celcius = (Double) method.invoke(temperature,80.0);
    assertEquals(26.666666,celcius,0.001);
  }
}