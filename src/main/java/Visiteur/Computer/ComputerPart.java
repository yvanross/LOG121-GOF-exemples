package Visiteur.Computer;

public interface ComputerPart {
  public void accept(ComputerPartVisitor computerPartVisitor);
}