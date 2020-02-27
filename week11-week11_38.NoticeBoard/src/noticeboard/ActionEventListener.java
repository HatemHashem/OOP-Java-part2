package noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListener implements ActionListener {
    private JTextField original;
    private JLabel destination;

    public ActionEventListener(JTextField original, JLabel destination) {
        this.original = original;
        this.destination = destination;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.destination.setText(this.original.getText());
        this.original.setText("");

    }
}
