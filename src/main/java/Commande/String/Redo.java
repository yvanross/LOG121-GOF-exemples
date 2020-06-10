package Commande.String;
/**
 * This is a semantic interface that indicates that a command object is
 * a redo command.
 package Commande.String;
 /*<p>
 * Most subclasses of the AbstractCommand classes are responsible for
 * encapsulating the top level logic of whatever commend they represent.
 * Redo is a special case that is treated differently. Because redo is
 * the responsibility of the CommandManager, all that a class that
 * represents redo should do is let a CommandManager object know that it
 * should redo the the most recently undone command.  It is preferable
 * for it to do that in a way that does not expose any special logic of
 * the CommandManager class.  The CommandManager class has no other
 * reason to know about and subclasses of AbstractCommand, so the
 * mechanism for it finding out that it is supposed to redo a command
 * should not make it dependant on any subclasses of AbstractCommand.
 *<p>
 * An organization that satisifes those constraints is for the subclass
 * of AbstractCommand that represents unto to implement this interface
 * and not actually do anything.  When a CommandManager object notices
 * that it is being given an object ot execute that implements the Redo
 * interface, instead of trying to invoke the command normally, it will
 * redo the previous redo.
 */
interface Redo {
} // interface Redo
