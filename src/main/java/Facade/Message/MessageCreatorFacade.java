package Facade.Message;

import java.util.Hashtable;
import java.util.Vector;

/**
 * Instances of this class are used to create and send e-mail messages.
 * It assumes that an e-mail message consists of a message body and zero or
 * more attachments. The content of the message body must be provided as
 * either a String object or an object that implements an interface called
 * RichText.  Any kind of an object can be provided as the content of an
 * attachment. 
 */
public class MessageCreatorFacade {
    // Constants to indicate the type of message to create
    public final static int MIME = 1;
    public final static int MAPI = 2;
    public final static int NOTES = 3;
    public final static int BANYAN = 4;

    private Hashtable<String,String> headerFields = new Hashtable<String,String> ();
    private RichText messageBody;
    private Vector<Object> attachments = new Vector<Object>();
    private boolean signMessage;

    /**
     * Constructor to create a MessageCreator object that will create an
     * e-mail message and send it to the given address.  It will attempt to
     * infer the type of message to create from the "to" address.
     * @param to The address that this object will send a message to.
     * @param from The address that the message will say it is from.
     * @param subject The subject of this message.
     */
    public MessageCreatorFacade(String to, String from, String subject) {
        this(to, from , subject, inferMessageType(to));
    } // Constructor(String, String, String)

    /**
     * Constructor to create a MessageCreator object that will create an
     * e-mail message and send it to the given address.  It will attempt to
     * infer the type of message to create from the "to" address.
     * @param to The address that this object will send a message to.
     * @param from The address that the message will say it is from.
     * @param subject The subject of this message.
     * @param type The type of message to create.
     */
    public MessageCreatorFacade(String to, String from, String subject, int type) {
        headerFields.put("to", to);
        headerFields.put("from", from);
        headerFields.put("subject", subject);
        //...
    } // Constructor(String, String, String, int)

    /**
     * Set the contents of the message body.
     * @param messageBody The contents of the message body.
     */
    public void setMessageBody(String messageBody) {
        setMessageBody(new RichTextString(messageBody));
    } // setMessageBody(String)

    /**
     * Set the contents of the contents body.
     * @param messageBody The contents of the message body.
     */
    public void setMessageBody(RichText messageBody) {
        this.messageBody = messageBody;
    } // setMessageBody(RichText)

    /**
     * Add an attachement to the message
     * @param attachment the object to attach to the message
     */
    public void addAttachment(Object attachment) {
        attachments.addElement(attachment);
    } // addAttachment(Object)

    /**
     * set whether this message should be signed.  The default is false.
     */
    public void setSignMessage(boolean signFlag) {
        signMessage = signFlag;
    } // setSignMessage(boolean)
    
    /**
     * Set the value of a header field.
     * @param name The name of the field to set the value of
     * @param value The value to set the field to.
     */
    public void setHeaderField(String name, String value) {
        headerFields.put(name.toLowerCase(), value);
    } // setHeaderField(String, String)

    /**
     * Send the message.
     */
    public void send() {
        System.out.println("\nSend message\n----------");
        MessageBody body = new MessageBody(messageBody);
        for (int i = 0; i < attachments.size(); i++) {
            body.addAttachment(new Attachment(attachments.elementAt(i)));
        } // for
        MessageHeader header = new MessageHeader(headerFields);
        System.out.println("header: " + headerFields.toString());
        System.out.println("body:" + messageBody.toString());
        Message msg = new Message(header, body);
        if (signMessage) {
            msg.setSecurity(createSecurity());
        } // if
        createMessageSender(msg);
    } // send()

    /**
     * Infer an message type from a destination e-mail address.
     * @param address an e-mail address.
     */
    private static int inferMessageType(String address) {
        int type = 0;
        //...
        return type;
    } // inferMessageType(String)

    /**
     * Create a Security object appropriate for signing this message.
     */
    private Security createSecurity() {
        Security s = null;
        //...
        return s;
    } // createSecurity()

    /**
     * Create a MessageSender object appropriate for the type of
     * message being sent.
     */
    private void createMessageSender(Message msg) {
        //...
    } // createMessageSender(Message)
    //...
} // class MessageCreator
