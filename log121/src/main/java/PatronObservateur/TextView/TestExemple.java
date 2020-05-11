/**
 * LOG121: Conception orientée objet
 * A simple example of the Model/View/Controller architecture
 * 
 * @author Patrice Boucher
 * @date 2012/10/17
 */

package PatronObservateur.TextView;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TestExemple extends WindowAdapter{
	
	public TestExemple(){
		TextModel model = new TextModel();
				
		TextViewA   view1 = new TextViewA(model,"Interface 1");
		TextViewA   view2 = new TextViewA(model,"Interface 2");
		TextViewB   view3 = new TextViewB(model,"Interface 3");	
		
		view1.addWindowListener(this);
		view2.addWindowListener(this);
		view3.addWindowListener(this);
		
		nbWin = 3;
	}
	
	/**
	 * Program's main
	 * @param args Not used
	 */
	public static void main(String[] args) {
		
		TestExemple mvc = new TestExemple();
		System.out.println(mvc.toString());
	}
	
	public void windowClosing(WindowEvent e) {
        nbWin--;
        if(nbWin==0)
        	System.exit((int) 0);
        
    }
	private int nbWin;
}
