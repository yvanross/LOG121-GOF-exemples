 /** LOG121: Conception orientée objet
 * A simple example of the Model/View/Controller architecture
 * ModelZ is an example of implementation of an AbstractModel 
 * of the ViewAObserver
 * 
 * @author Patrice Boucher
 * @date 2012/10/17
 */

package PatronObservateur.TextView; 
import java.util.Observable;
@SuppressWarnings({ "deprecation"})

public class TextModel extends Observable{
	
	public TextModel()
	{
		text = "";
	}

	//@Override
	public synchronized String getState() {
		// Auto-generated method stub
		return  text;
	}

	//@Override
	public synchronized void setState(String aState) {
 		text =  aState;
 		super.setChanged();
		super.notifyObservers();
	}
	
	private String   text;
 
}
