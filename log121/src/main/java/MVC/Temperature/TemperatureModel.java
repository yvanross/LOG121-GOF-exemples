package MVC.Temperature;

/**
 * Exemple adapté de:
 * https://csis.pace.edu/~bergin/mvc/mvcgui.html
 * Joseph Bergin, Pace University, jbergin@pace.edu
 */
@SuppressWarnings({ "deprecation"})

public class TemperatureModel extends java.util.Observable
{	
	private double temperatureF = 32.0;

	public double getF(){ return temperatureF; }
	
	public double getC(){ return (temperatureF - 32.0) * 5.0 / 9.0; }
	
	public void setF(double tempF)
	{	
		temperatureF = tempF;
		setChanged();
		notifyObservers();
	}
	
	public void setC(double tempC)
	{	
		temperatureF = tempC*9.0/5.0 + 32.0;
		setChanged();
		notifyObservers();
	}

}