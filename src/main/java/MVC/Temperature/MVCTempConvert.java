package MVC.Temperature;

/**
 * Exemple adapté de:
 * https://csis.pace.edu/~bergin/mvc/mvcgui.html
 * Joseph Bergin, Pace University, jbergin@pace.edu
 */

public class MVCTempConvert 
{	
	public static void main(String args[]) 
	{	
		TemperatureModel temperature = new TemperatureModel();
		new FarenheitGUI(temperature, 100, 100);
		new CelsiusGUI(temperature, 100, 250);
		new GraphGUI(temperature, 400, 100);
		new SliderGUI(temperature, 100, 400);
	}
}
