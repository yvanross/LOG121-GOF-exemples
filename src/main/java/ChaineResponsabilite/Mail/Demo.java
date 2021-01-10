package ChaineResponsabilite.Mail;

/**
 * Exemple du parton Chain of Responsibility
 * @author Vincent Lacasse
 *
 */

public class Demo {

	
	/** 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		Handler handler1 = new SpamHandler();
		Handler handler2 = new FanHandler();
		Handler handler3 = new ComplaintHandler();
		Handler handler4 = new NewLocationHandler();
		Handler handler5 = new NormalHandler();

		handler1.setProchain(handler2);
		handler2.setProchain(handler3);
		handler3.setProchain(handler4);
		handler4.setProchain(handler5);
		// handler5.setProchain(handler3);
		
		
		Analyser analyser = new Analyser(handler1);
		analyser.analyser();
	}	
}