import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Subtract implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton reset;

    public Subtract(JTextField input, JTextField output, JButton reset) {
        this.input = input;
        this.output = output;
        this.reset = reset;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (output.getText().isEmpty()) {
            output.setText(""+(0-Integer.parseInt(input.getText().toString())));
        }else {

            try {
                output.setText("" + (Integer.parseInt(output.getText()) - Integer.parseInt(input.getText())));
            }catch (NumberFormatException ex){
              input.setText("");
            }

        }
        if(output.getText().equals("0")){
            reset.setEnabled(false);
        }else {
            reset.setEnabled(true);
        }
        input.setText("");


    }
}
