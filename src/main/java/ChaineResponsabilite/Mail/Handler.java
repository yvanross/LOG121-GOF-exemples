package ChaineResponsabilite.Mail;

public abstract class Handler {
	public static final String START = "\n\t>>>> ";
	
	Handler successor;
	
	public void setProchain(Handler successor) throws Exception {
		this.successor = successor;
	}

	public abstract void handleRequest(Mail mail);
	
	public void printMsg(String s) {
		System.out.println(START + s); 
	}
}
