package MVC.Temperature;

/**
 * Exemple adapté de:
 * https://csis.pace.edu/~bergin/mvc/mvcgui.html
 * Joseph Bergin, Pace University, jbergin@pace.edu
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class CelsiusGUI extends TemperatureGUI
{	
	public CelsiusGUI(TemperatureModel model, int h, int v)
	{	
		super("Celsius Temperature", model, h, v);
		setDisplay("" + model.getC());
		addUpListener(new UpListener());
		addDownListener(new DownListener());
		addDisplayListener(new DisplayListener());
	}
	
	public void update(Observable t, Object o) // Called from the Model
	{	
		setDisplay("" + model().getC());
	}
	
	class UpListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	
			model().setC(model().getC() + 1.0);
		}
	}
	
	class DownListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	
			model().setC(model().getC() - 1.0);
		}
	}
	
	class DisplayListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	
			double value = getDisplay();
			model().setC(value);
		}
	}
}