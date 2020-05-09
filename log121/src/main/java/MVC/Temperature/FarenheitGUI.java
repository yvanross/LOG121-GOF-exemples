package MVC.Temperature;

/**
 * Exemple adapté de:
 * https://csis.pace.edu/~bergin/mvc/mvcgui.html
 * Joseph Bergin, Pace University, jbergin@pace.edu
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

class FarenheitGUI extends TemperatureGUI
{	
	public FarenheitGUI(TemperatureModel model, int h, int v)
	{	
		super("Farenheit Temperature", model, h, v);
		setDisplay(""+model.getF());
		addUpListener(new UpListener());
		addDownListener(new DownListener());
		addDisplayListener(new DisplayListener());
	}
	
	public void update(Observable t, Object o) // Called from the Model
	{	
		setDisplay("" + model().getF());
	}
	
	class UpListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	
			model().setF(model().getF() + 1.0);
		}
	}
	
	class DownListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	
			model().setF(model().getF() - 1.0);
		}
	}
	
	class DisplayListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	
			double value = getDisplay();
			model().setF(value);
		}
	}
}