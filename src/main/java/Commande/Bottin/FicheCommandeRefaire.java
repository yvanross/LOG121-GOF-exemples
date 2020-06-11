package Commande.Bottin;

public class FicheCommandeRefaire implements Commande, Refaire {

	@Override
	public boolean faire() {
		return false;
	}

	@Override
	public void defaire() {
System.out.println("FicheCommandeRefaire::defaire");
	}

	@Override
	public void refaire() {
		System.out.println("FicheCommandeRefaire::refaire");		
	}

}
