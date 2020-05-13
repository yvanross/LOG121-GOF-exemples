package MVC.Temperature;

/**
 * Exemple adapté de:
 * https://csis.pace.edu/~bergin/mvc/mvcgui.html
 * Joseph Bergin, Pace University, jbergin@pace.edu
 */

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Observable;
import java.util.Observer;
@SuppressWarnings({ "deprecation"})
public class GraphGUI extends Frame implements Observer
{	
	private static final long serialVersionUID=12345678;
	private TemperatureModel model;
	private Canvas gauges;
	private TemperatureGauge _farenheit;

	public GraphGUI(TemperatureModel model, int h, int v)
	{ 	
		super("Temperature Gauge");
		this.model = model;
		_farenheit = new TemperatureGauge(-200, 300);
		Panel Top = new Panel();
		add("North", Top);
		gauges = new TemperatureCanvas(_farenheit);
		gauges.setSize(500,350);
		add("Center", gauges);
		setSize(240, 350);
		setLocation(h,v);
		setVisible(true);
		model.addObserver(this); // Connect to the model
	}
	
	public void update(Observable obs, Object o) // Respond to changes
	{	
		repaint();
	}
		
	public void paint(Graphics g)
	{	
		int farenheit = (int)model.getF(); // Use the current data to paint
		_farenheit.set(farenheit);
		gauges.repaint();
		super.paint(g);
	}
}
