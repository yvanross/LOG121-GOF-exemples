package ChaineResponsabilite.Mail;

public class ComplaintHandler extends Handler {
	
	
	/** 
	 * @param mail
	 */
	@Override
	public void handleRequest(Mail mail) {
		if (applyRules(mail)) {
			System.out.println(mail.toString());
			printMsg("Ce courriel est un plainte.\t\t\t\t ENVOYER AU CONTENTIEUX.");
		}
		else
			successor.handleRequest(mail);
	}
	
	
	/** 
	 * @param mail
	 * @return boolean
	 */
	private boolean applyRules(Mail mail) {
		return mail.getSubject().toLowerCase().contains("complaint");
	}
}

