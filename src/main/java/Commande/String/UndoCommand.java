package Commande.String;
/**
 * Instances of this class represent undo commands.
 */
class UndoCommand implements Undo {
    /**
     * This implementation of doIt does not actually do anything.  The
     * logic for undo is in the CommandManager class.  A CommandManager
     * object knows that it is supposed to invoke its undo logic when it
     * sees an instace of this class because this class implments the
     * Undo interface.  The Undo interface is a semantic interface that
     * is used to mark a class as representing an undo command.
     */
    public boolean doIt() {
        // This method should never be called
        throw new NoSuchMethodError();
    } // doIt()
    
    /**
     * This implementation of undoIt does not actually do anything. 
     * Undo commands are not undone.  Instead a redo command is issued.
     */
    public boolean undoIt() {
        // This method should never be called
        throw new NoSuchMethodError();
    } // undoIt()
} // class UndoCommand
