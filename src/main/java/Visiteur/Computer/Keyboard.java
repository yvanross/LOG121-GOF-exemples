package Visiteur.Computer;

public class Keyboard implements ComputerPart {

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
     computerPartVisitor.visit(this);
  }
}