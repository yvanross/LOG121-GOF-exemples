package Memento;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JTextArea;

import org.junit.Test;

import Memento.DerekBanas.TestMemento;
import Utils.OutStream;

public class DerekBanasTest extends OutStream {

  @Test
  public void testButton() throws NoSuchFieldException, SecurityException, NoSuchMethodException,
      IllegalAccessException, IllegalArgumentException, InvocationTargetException {
  
    TestMemento testMemento = new TestMemento();
  
    JTextArea article = testMemento.getArticle();
    
    article.append("allo mon coco1");
    testMemento.save();
    assertEquals("allo mon coco1" , article.getText());
   
    article.append(" allo mon coco2"); 
    testMemento.save();
    assertEquals("allo mon coco1 allo mon coco2" , article.getText());
    

    article.append(" allo mon coco3"); 
    assertEquals("allo mon coco1 allo mon coco2 allo mon coco3" , article.getText());
    testMemento.undo();
    assertEquals("allo mon coco1 allo mon coco2" , article.getText());

     testMemento.undo();
     assertEquals("allo mon coco1" , article.getText());

     testMemento.redo();
     assertEquals("allo mon coco1 allo mon coco2" , article.getText());
   
     testMemento.redo();
     assertEquals("allo mon coco1 allo mon coco2" , article.getText());

     assertEquals("From Originator: Current Version of Article"+System.lineSeparator()+
     "allo mon coco1"+System.lineSeparator()+
     System.lineSeparator()+
     "From Originator: Saving to Memento"+System.lineSeparator()+
     "Save Files 1"+System.lineSeparator()+
     "From Originator: Current Version of Article"+System.lineSeparator()+
     "allo mon coco1 allo mon coco2"+System.lineSeparator()+
     System.lineSeparator()+
     "From Originator: Saving to Memento"+System.lineSeparator()+
     "Save Files 2"+System.lineSeparator()+
     "From Originator: Previous Article Saved in Memento"+System.lineSeparator()+
     "allo mon coco1 allo mon coco2"+System.lineSeparator()+
     System.lineSeparator()+
     "From Originator: Previous Article Saved in Memento"+System.lineSeparator()+
     "allo mon coco1"+System.lineSeparator()+
     System.lineSeparator()+
     "From Originator: Previous Article Saved in Memento"+System.lineSeparator()+
     "allo mon coco1 allo mon coco2"+System.lineSeparator()+System.lineSeparator(),getOutput());
    }
  
}