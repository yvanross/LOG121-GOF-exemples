package Commande.String;
import java.util.LinkedList;
/**
 * Instances of this class are responsible for managing the execution of
 * commands.  More specifically, for the purposes of this word processing
 * program, instances of this class are responsible for maintaining a
 * command history for undo and redo.
 */
class CommandManager {
    // The maximum number of command to keep in the history
    private final int maxHistoryLength = 100;

    private final LinkedList history = new LinkedList();
    private final LinkedList redoList = new LinkedList();

    /**
     * Invoke a command and add it to the history,
     * <p>
     * If the command object's doIt method was previously called, then it is
     * expected to return false.
     */
    public void invokeCommand(final AbstractCommand command) {
        if (command instanceof Undo) {
            undo();
            return;
        } // if undo
        if (command instanceof Redo) {
            redo();
            return;
        } // if redo
        if (command.doIt()) {
            // doIt returned true, which means it can be undone
            addToHistory(command);
        } else { // command cannot be undone
            history.clear();
        } // if
          // After a command that is not an undo or a redo, ensure that
          // the redo list is empty.
        if (redoList.size() > 0)
            redoList.clear();
    } // invokeCommand(AbstractCommand)

    /**
     * Undo the most recent command in the commmand history.
     */
    private void undo() {
        if (history.size() > 0) { // If there are commands in the history
            AbstractCommand undoCommand;
            undoCommand = (AbstractCommand) history.removeFirst();
            undoCommand.undoIt();
            redoList.addFirst(undoCommand);
        } // if
    } // undo()

    /**
     * Redo the most recently undone command
     */
    private void redo() {
        if (redoList.size() > 0) { // If the redo list is not empty
            AbstractCommand redoCommand;
            redoCommand = (AbstractCommand) redoList.removeFirst();
            redoCommand.doIt();
            history.addFirst(redoCommand);
        } // if
    } // redo()

    /**
     * Add a command to the command history.
     * 
     * @param command the command to add to the history.
     */
    private void addToHistory(final AbstractCommand command) {
        history.addFirst(command);
        // If size of history has exceded maxHistoryLength, remove
        // the oldest command from the history
        if (history.size() > maxHistoryLength)
          history.removeLast();
    } // addToHistory(AbstractCommand)
} // class CommandManager
