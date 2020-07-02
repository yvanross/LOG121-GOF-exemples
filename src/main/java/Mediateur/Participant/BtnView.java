package Mediateur.Participant;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//A concrete colleague
class BtnView extends JButton implements Command {

    /**
     *
     */
    private static final long serialVersionUID = -3491968649552307948L;
    Mediator med;

    BtnView(ActionListener al, Mediator m) {
        super("View");
        addActionListener(al);
        med = m;
        med.registerView(this);
    }

    public void execute() {
        med.view();
    }
    
}

