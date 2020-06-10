package Commande.String;
/**
 * Instances of this class represent redo commands.
 */
class RedoCommand implements Redo {
    /**
     * This implementation of doIt does not actually do anything.  The
     * logic for redo is in the CommandManager class.  A CommandManager
     * object knows that it is supposed to invoke its redo logic when it
     * sees an instace of this class because this class implments the
     * Redo interface.  The Redo interface is a semantic interface that
     * is used to mark a class as representing an redo command.
     */
    public boolean doIt() {
        // This method should never be called
        throw new NoSuchMethodError();
    } // doIt()
    
    /**
     * This implementation of undoIt does not actually do anything. 
     * Redo commands are not undone.  Instead a undo command is issued.
     */
    public boolean undoIt() {
        // This method should never be called
        throw new NoSuchMethodError();
    } // undoIt()
} // class RedoCommand
