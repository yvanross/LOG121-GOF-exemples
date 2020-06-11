package Commande.String;

import org.junit.Test;

public class StringTest {
 
  @Test
  public void commandManagerTest(){
    
    Document document = new Document();
    InsertStringCommand insertStringCommand = new InsertStringCommand(document, 0, "allo mon coco");
    DeleteCommand deleteCommand = new DeleteCommand(document,0,4);

    insertStringCommand.doIt();
    insertStringCommand.undoIt();
    document.redoCommand();
  
     CommandManager commandManager = new CommandManager();
     commandManager.invokeCommand(insertStringCommand);
     commandManager.invokeCommand(deleteCommand);
    //  UndoCommand undoCommand = new UndoCommand();
    //  commandManager.invokeCommand(undoCommand);


  }
}