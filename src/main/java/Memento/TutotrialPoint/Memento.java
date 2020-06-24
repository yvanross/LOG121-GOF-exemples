package Memento.TutotrialPoint;

/**
 * Memento contains state of an object to be restored.
 */
public class Memento {
  private String state;

  public Memento(String state){
     this.state = state;
  }

  public String getState(){
     return state;
  }	
}