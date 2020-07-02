package Adaptateur.Customer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OK extends Frame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] argv) {
        OK app = new OK();
        app.setVisible(true);
    } // main(String)

    public OK() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        Button ok = new Button("OK");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exit();
            } // actionPerformed(ActionEvent)
          } );
        add(ok);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                exit();
            } // windowClosing(WindowEvent)
          } );
        pack();
    } // constructor()

    void exit() {
        System.exit(0);
    } // exit()
} // class OK
