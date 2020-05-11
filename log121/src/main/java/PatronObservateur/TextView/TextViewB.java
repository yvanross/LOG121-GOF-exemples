/**
 * LOG121: Conception orientée objet
 * A simple example of the Model/View/Controller architecture
 * ViewBObserver is an other example of view that implements AbstractObserver
 * 
 * @author Patrice Boucher
 * @date 2012/10/17
 */

 package PatronObservateur.TextView;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;
@SuppressWarnings({ "deprecation"})
public class TextViewB extends JFrame implements  Observer, ActionListener{
	
	private JTextField editableText;
	private TextModel model=null;
	public static final long serialVersionUID = 645848454;
	
	public TextViewB(TextModel aModel, String name)
	{
		super(name);
		//super.setSize(WIDTH, HEIGHT);
		model = aModel;
		aModel.addObserver(this);
		
		JPanel aPanel = new JPanel();
		aPanel.setLayout(new BorderLayout());
		aPanel.setBackground(Color.cyan);
		
		editableText = new JTextField();
		editableText.addActionListener(this);
		//editableText.add
		
		JScrollPane aScrollPane = new JScrollPane(editableText);
		aScrollPane.setVerticalScrollBarPolicy(
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		aScrollPane.setPreferredSize(new Dimension(250, 250));
		aPanel.add(aScrollPane);
		super.add(aPanel);
		super.pack(); 
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	/**
	 * Detach this observer from the model's list
	 */
	public void finalize()
	{
		model.deleteObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		String state = model.getState();
		editableText.setText(state);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		model.setState(event.getActionCommand());
	}
}
