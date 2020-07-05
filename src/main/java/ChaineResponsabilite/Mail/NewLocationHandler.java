package ChaineResponsabilite.Mail;

public class NewLocationHandler extends Handler {
	
	@Override
	public void handleRequest(Mail mail) {
		if (applyRules(mail)) {
			System.out.println(mail.toString());
			printMsg("Demande pour une nouvelle installation.\t\t ENVOYER AU DEVELOPPEMENT DES AFFAIRES.");
		}
		else
			successor.handleRequest(mail);
	}
	
	private boolean applyRules(Mail mail) {
		return mail.getSubject().toLowerCase().contains("location");
	}
}
