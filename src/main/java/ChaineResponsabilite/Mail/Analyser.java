package ChaineResponsabilite.Mail;

public class Analyser {
	Handler h;
	
	public Analyser (Handler h) { this.h = h; }
	
	public void analyser() {
		h.handleRequest(creerCourriel1());
		h.handleRequest(creerCourriel2());
		h.handleRequest(creerCourriel3());
		h.handleRequest(creerCourriel4());
		h.handleRequest(creerCourriel5());
		h.handleRequest(creerCourriel6());
	}
	
	static Mail creerCourriel1() {		
		// SPAM
		String from = "rxlygealaigpsofk@pharmaaa.can";
		String[] to = { "info@compagnie.com" };
		String[] cc = { };
		String subject = "J'ai du viagra pas cher pour toi, mon ami.";
		String text = "";
	    return new Mail(from, to, cc, subject, text);
	}

	static Mail creerCourriel2() {	
		// FAN
		String from = "je.vous.adore@gmail.com";
		String[] to = { "info@compagnie.com" };
		String[] cc = { };
		String subject = "Merci beaucoup.";
		String text = "j'adore votre produit.";
	    return new Mail(from, to, cc, subject, text);
	}
	
	static Mail creerCourriel3() {	
		// COMPLAINT
		String from = "maman.fachee@gmail.com";
		String[] to = { "info@compagnie.com" };
		String[] cc = { };
		String subject = "Complaint";
		String text = "Mon fils joue tout le temps, il n'étudie plus, snif!";
	    return new Mail(from, to, cc, subject, text);
	}

	static Mail creerCourriel4() {	
		// NEWLOCATION
		String from = "business.man@gmail.com";
		String[] to = { "info@compagnie.com" };
		String[] cc = { };
		String subject = "Location";
		String text = "J'aimerais installer votre jeu à Val d'Or";
	    return new Mail(from, to, cc, subject, text);
	}
	
	static Mail creerCourriel5() {	
		// SPAM et FAN
		String from = "un.tres.bon.ami@yahoo.com";
		String[] to = { "info@compagnie.com" };
		String[] cc = { };
		String subject = "Mortgage";
		String text = "J'ai besoin d'inforamtion";
	    return new Mail(from, to, cc, subject, text);
	}

	static Mail creerCourriel6() {	
		// normal
		String from = "normal.ok@gmail.com";
		String[] to = { "info@compagnie.com" };
		String[] cc = { };
		String subject = "Bonjour";
		String text = "J'ai besoin d'inforamtion";
	    return new Mail(from, to, cc, subject, text);
	}

}
