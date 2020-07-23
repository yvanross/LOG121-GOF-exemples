package Proptoptype.ConcretePrototype;

// Prototype pattern
public abstract class Prototype implements Cloneable {
  public Prototype clone() throws CloneNotSupportedException{
      return (Prototype) super.clone();
  }
}