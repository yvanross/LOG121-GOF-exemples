package Commande.String;
/**
 * This is a semantic interface that indicates that a command object is
 * an undo command.
 *<p>
 * Most subclasses of the AbstractCommand classes are responsible for
 * encapsulating the top level logic of whatever commend they represent.
 * Undo is a special case that is treated differently. Because undo is
 * the responsibility of the CommandManager, all that a class that
 * represents undo should do is let a CommandManager object know that it
 * should undo the last command.  It is preferable for it to do that in
 * a way that does not expose any special logic of the CommandManager
 * class.  The CommandManager class has no other reason to know about
 * any subclasses of AbstractCommand, so the mechanism for it finding
 * out that it is supposed to undo a command should not make it
 * dependant on any subclasses of AbstractCommand.
 *<p>
 * An organization that satisifes those constraints is for the subclass
 * of AbstractCommand that represents unto to implement this interface
 * and not actually do anything.  When a CommandManager object notices
 * that it is being given an object ot execute that implements the Undo
 * interface, instead of trying to invoke the command normally, it will
 * undo the previous undo.
 */
interface Undo {
} // interface Undo
