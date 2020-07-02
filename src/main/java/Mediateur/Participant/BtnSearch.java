package Mediateur.Participant;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//A concrete colleague
class BtnSearch extends JButton implements Command {

    /**
     *
     */
    private static final long serialVersionUID = -8539469399487555385L;
    Mediator med;

    BtnSearch(ActionListener al, Mediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }

    public void execute() {
        med.search();
    }
    
}
