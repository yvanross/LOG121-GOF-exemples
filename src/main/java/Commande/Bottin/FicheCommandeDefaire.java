package Commande.Bottin;

public class FicheCommandeDefaire implements Commande, Defaire {

	@Override
	public boolean faire() {
		return false;
	}

	@Override
	public void defaire() {
		System.out.print("defaire");
	}

	@Override
	public void refaire() {
	 System.out.println("refaire");
		
	}

}
