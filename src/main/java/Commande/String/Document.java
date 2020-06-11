package  Commande.String;
/**
 * Instances of this class represent a document in a word processor.(){}
 */
class Document {
    //...
    /**
     * Insert a string into this document at the given postion.
     * @param position Insert the string before this position.
     * @param strng the string to insert into this document
     */
    void insertStringCommand(final int position, final String strng) {
        System.out.println("insertCommand called on document");
    } 

    /**
     * Delete the given number of character at the given position from
     * this document.
     * @param position The position to delete characters at.
     * @param length The number of characters to delete.
     */
    void deleteCommand(final int position, final int length) {
        System.out.println("deleteCommand Called on document");
    } // deleteCommand(int, int)

    void undoCommand(){
        System.out.println("UndoCommand called on document");
    }

    void redoCommand(){
        System.out.println("redoCommand called on document");
    }
    /**
     * Return the string contained in this document starting at the
     * given position and containing the given numbers of characters.
     * @param position the position in the document that the sequence of
     *                 characters to be retured begins at.
     * @param length The number of characters in the string to be
     *               returned. 
     */
    String getString(final int position, final int length) {
        final String s = "";
        //...
        return s;
    } // getString(int, int)
} // class Document
