import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton resetButton;

    public Add(JTextField input, JTextField output, JButton resetButton) {
        this.input = input;
        this.output = output;
        this.resetButton = resetButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (output.getText().isEmpty()) {
            output.setText(input.getText());
        } else {

            try {
                output.setText(String.valueOf(Integer.parseInt(input.getText()) + Integer.parseInt(output.getText())));
            } catch (NumberFormatException ex) {
                input.setText("");

            }

        }
        if (output.getText().toString().equals("0")) {
            resetButton.setEnabled(false);
        } else {
            resetButton.setEnabled(true);
        }
        input.setText("");
    }
}
