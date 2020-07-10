package ChaineResponsabilite.Mail;

public class NormalHandler extends Handler {
	
	@Override
	public void handleRequest(Mail mail) {
		System.out.println(mail.toString());
		printMsg("Ce courriel est normal.\t\t\t\t ENVOYER AU SERVICE À LA CLIENTÈLE.");
	
	}
	public void setProchain(Handler prochain) throws Exception {
		 throw new  Exception("Should never be used");
	}

}
