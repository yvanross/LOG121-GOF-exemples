package Commande.Bottin;

public abstract class AbstractCommand implements Commande {
  public  boolean faire(){
    throw new UnsupportedOperationException();
  };
	public  void defaire(){
    throw new UnsupportedOperationException();
  };
	public  void refaire(){
    throw new UnsupportedOperationException();
  };
}