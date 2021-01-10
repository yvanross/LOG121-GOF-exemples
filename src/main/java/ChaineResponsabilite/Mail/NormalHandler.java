package ChaineResponsabilite.Mail;

public class NormalHandler extends Handler {
	
	
	/** 
	 * @param mail
	 */
	@Override
	public void handleRequest(Mail mail) {
		System.out.println(mail.toString());
		printMsg("Ce courriel est normal.\t\t\t\t ENVOYER AU SERVICE À LA CLIENTÈLE.");
	
	}
	
	/** 
	 * @param prochain
	 * @throws Exception
	 */
	public void setProchain(Handler prochain) throws Exception {
		 throw new  Exception("Should never be used");
	}

}
