package Commande.String;
/**
 * This class is the superclass of classes the encapsulate commands for a word
 * processor.
 */
public abstract class AbstractCommand {
    /**
     * The CommandManager that manages command objects.
     */
    public final static CommandManager manager = new CommandManager();

    /**
     * Perform the command encapsulated by this object.
     * @return true if sucessful and can be undone.
     */
    public abstract boolean doIt();

    /**
     * Undo the last invocation of doIt.
     * @return true if the unndo was successful
     */
    public abstract boolean undoIt();
} // class AbstractCommand
