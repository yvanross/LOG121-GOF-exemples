package Commande.String;
/**
 * Command to delete a string from a document.
 */
class DeleteCommand extends AbstractCommand {
    private Document document;  // The document to insert into
    private int position;       // The position to insert at
    private int length;         // The length of the string to delete
    String strng;               // The string that was deleted

    /**
     * Constructor
     * @param document The document to delete from
     * @param position The position to delete from
     * @param strng The length of the string to delete.
     */
    DeleteCommand(Document document, int position, int length) {
        this.document = document;
        this.position = position;
        this.length = length;
        manager.invokeCommand(this);
    } // Constructor(Document, int, int)

    /**
     * Perform the command encapsulated by this object.
     * @return true if this call to doIt was successful and can be undone
     */
    public boolean doIt() {
        try {
            strng = document.getString(position, length);
            document.deleteCommand(position, length);
        } catch (Exception e) {
            return false;
        } // try
        return true;
    } // doIt()

    /**
     * Undo the command encapsulated by this object.
     * @return true if the undo was successful
     */
    public boolean undoIt() {
        try {
            document.insertStringCommand(position, strng);
        } catch (Exception e) {
            return false;
        } // try
        return true;
    } // undoIt()
} // class DeleteCommand
