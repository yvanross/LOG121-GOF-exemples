package Commande.String;
/**
 * Command to insert a string into a document.
 */
class InsertStringCommand extends AbstractCommand {
    private Document document;  // The document to insert into
    private String strng;       // The string to insert
    private int position;       // The position to insert at

    /**
     * Constructor
     * @param document The document to insert into
     * @param position The position to insert at
     * @param strng The string to insert
     */
    InsertStringCommand(Document document, int position, String strng) {
        this.document = document;
        this.position = position;
        this.strng = strng;
        manager.invokeCommand(this);
    } // Constructor(Document, int, String)

    /**
     * Perform the command encapsulated by this object.
     * @return true if this call to doCommand was successful and can be undone
     *              by a call to undoCommand. 
     */
    public boolean doIt() {
        try {
            document.insertStringCommand(position, strng);
        } catch (Exception e) {
            return false;
        } // try
        return true;
    } // doIt()

    /**
     * Undo the command encapsulated by this object.
     * @return true if undo was successful
     */
    public boolean undoIt() {
        try {
            document.deleteCommand(position, strng.length());
        } catch (Exception e) {
            return false;
        } // try
        return true;
    } // undoIt()
} // class InsertStringCommand
