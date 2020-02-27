import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reset implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton reset;

    public Reset(JTextField input, JTextField output, JButton reset) {
        this.input = input;
        this.output = output;
        this.reset = reset;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        output.setText("0");
        input.setText("");

        reset.setEnabled(false);

    }
}
