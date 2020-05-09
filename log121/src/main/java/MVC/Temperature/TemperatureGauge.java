package MVC.Temperature;

/**
 * Exemple adapté de:
 * https://csis.pace.edu/~bergin/mvc/mvcgui.html
 * Joseph Bergin, Pace University, jbergin@pace.edu
 */

class TemperatureGauge
{	
	private int Max, Min, current;

	public TemperatureGauge(int min, int max){ Min = min; Max = max; }
	
	public void set(int level) { current = level; }	
	public int get(){ return current; }
	public int getMax(){ return Max; }
	public int getMin(){ return Min; }
}
