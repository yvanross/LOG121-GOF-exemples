package ChaineResponsabilite.Mail;

public class FanHandler extends Handler {
    public static final String[] FANS = {
    		"un.ami@hotmail.ca",
    		"un.tres.bon.ami@yahoo.com",
    		"je.vous.adore@gmail.com" };
	
	
	/** 
	 * @param mail
	 */
	@Override
	public void handleRequest(Mail mail) {
		if (applyRules(mail)) {
			System.out.println(mail.toString());
			printMsg("Ce courriel provient d'un admirateur.\t\t ENVOYER AU CEO.");
		}
		else
			successor.handleRequest(mail);
	}
	
	
	/** 
	 * @param mail
	 * @return boolean
	 */
	private boolean applyRules(Mail mail) {
		return match(mail.getFrom());
	}
	
	
	/** 
	 * @param m
	 * @return boolean
	 */
	private boolean match(String m) {
		for (String s : FANS)
			if (m.toLowerCase().contains(s.toLowerCase()))
				return true;
		return false;
	}
}

