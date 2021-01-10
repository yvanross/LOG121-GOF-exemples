package ChaineResponsabilite.Mail;

public class SpamHandler extends Handler {
	public static final int MAX_TO = 3;
	public static final int MAX_CC = 20;
    public static final String[] EXCLURE = {
    		"viagra",
    		"financing available",
    		"oil change",
    		"discount",
    		"mortgage" };
	
	
	/** 
	 * @param mail
	 */
	@Override
	public void handleRequest(Mail mail) {
		if (applyRules(mail)) {
			System.out.println(mail.toString());
			printMsg("Ceci est un pourriel.\t\t\t\t DÉTRUIRE.");
		}
		else
			successor.handleRequest(mail);
	}
	
	
	/** 
	 * @param mail
	 * @return boolean
	 */
	private boolean applyRules(Mail mail) {
		return  match(mail.getSubject()) ||
				mail.getToSize() > MAX_TO ||
				mail.getCcSize() > MAX_CC;
	}
	
	
	/** 
	 * @param m
	 * @return boolean
	 */
	private boolean match(String m) {
		for (String s : EXCLURE)
			if (m.toLowerCase().contains(s.toLowerCase()))
				return true;
		return false;
	}
}
