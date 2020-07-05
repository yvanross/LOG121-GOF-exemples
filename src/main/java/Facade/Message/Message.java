package Facade.Message;

/**
 * Instances of this class encapsulate e-mail messages.
 */
class Message {
    /**
     * Constructor
     * @param header The message header.
     * @param body The message body.
     */
    Message(MessageHeader header, MessageBody body) {
        //...
    } // constructor(MessageHeader, MessageBody)

    /**
     * Set the Security object that this object will use to sign itself.
     */
    void setSecurity(Security s) {
        //...
    } // setSecurity(Security)
    //...
} // class Message
