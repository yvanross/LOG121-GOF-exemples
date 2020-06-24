package Memento;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Memento.TutotrialPoint.CareTaker;
import Memento.TutotrialPoint.Originator;

public class TutorialPoint {
  
  @Test
  public void MementoPatternDemo() {
    
       Originator originator = new Originator();
       CareTaker careTaker = new CareTaker();
       
       originator.setState("State #1");
       originator.setState("State #2");
       careTaker.add(originator.saveStateToMemento());
       
       originator.setState("State #3");
       careTaker.add(originator.saveStateToMemento());
       
       originator.setState("State #4");
       System.out.println("Current State: " + originator.getState());		
       assertEquals("State #4",originator.getState());

       originator.getStateFromMemento(careTaker.get(0));
       System.out.println("First saved State: " + originator.getState());
       assertEquals("State #2",originator.getState());


       originator.getStateFromMemento(careTaker.get(1));
       System.out.println("Second saved State: " + originator.getState());
       assertEquals("State #3",originator.getState());

 }
}