package ChaineResponsabilite.Mail;

public abstract class Handler {
	public static final String START = "\n\t>>>> ";
	
	Handler successor;
	
	
	/** 
	 * @param successor
	 * @throws Exception
	 */
	public void setProchain(Handler successor) throws Exception {
		this.successor = successor;
	}

	
	
	
	/** 
	 * @param s
	 */
	/** 
	 * @param s
	 */
	/** 
	 * @param s
	 */
	public abstract void handleRequest(Mail mail);
	
	
	/** 
	 * @param s
	 */
	public void printMsg(String s) {
		System.out.println(START + s); 
	}
}
