package Facade.Message;

/**
 * Instances of this class encapsulate a string for inclusion in message bodies.
 */
class RichTextString implements RichText {
    private final String text;

    @Override
    public String toString() {
        return text;
    }

    /**
     * Constructor
     * 
     * @param text The string that this object adapts to the RichText interface.
     */
    public RichTextString(final String text) {
        this.text = text;
    } // constructor(String)
    //...
} // class RichTextString
