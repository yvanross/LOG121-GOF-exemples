/**
 * LOG121: Conception orientée objet
 * A simple example of the Model/View/Controller architecture
 * ViewAObserver is an example of view that implements AbstractObserver
 * 
 * @author Patrice Boucher
 * @date 2012/10/17
 */

package PatronObservateur.TextView;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class TextViewA extends JFrame implements  Observer, ActionListener{
	
	private JTextField editableText;
	private TextModel model=null;
	public static final long serialVersionUID = 645848454;
	
	public TextViewA(TextModel aModel, String name)
	{
		super(name);
		//super.setSize(WIDTH, HEIGHT);
		model = aModel;
		aModel.addObserver(this);
		
		JPanel aPanel = new JPanel();
		aPanel.setLayout(new BorderLayout());
		
		//Image im = new Image()
		JImagePanel violon1 = new JImagePanel("src/violine.jpg");
		JImagePanel violon2 = new JImagePanel("src/violine.jpg");
		JImagePanel violon3 = new JImagePanel("src/violine.jpg");
		JImagePanel violon4 = new JImagePanel("src/violine.jpg");
		aPanel.add(violon1, BorderLayout.NORTH);
		aPanel.add(violon2, BorderLayout.EAST);
		aPanel.add(violon3, BorderLayout.SOUTH);
		aPanel.add(violon4, BorderLayout.WEST);
		
		editableText = new JTextField();//("allo"); 
		editableText.addActionListener(this);
		//editableText.add
		
		JScrollPane aScrollPane = new JScrollPane(editableText);
		aScrollPane.setVerticalScrollBarPolicy(
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		aScrollPane.setPreferredSize(new Dimension(300, 30));
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
	public void update(Observable arg0, Object arg1) {
		String state = model.getState();
		editableText.setText(state);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		model.setState(event.getActionCommand());
	}
}
