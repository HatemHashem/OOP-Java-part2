
import javax.swing.*;
import java.awt.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame=new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400,200));
        frame.pack();
        createComponents(frame.getContentPane());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JTextField answerTextField=new JTextField("0");
        JTextField inputTextField=new JTextField("");
        answerTextField.setEnabled(false);
        container.setLayout(new GridLayout(3,1));
        container.add(answerTextField);
        container.add(inputTextField);
        container.add(createPanel(inputTextField,answerTextField));


    }
    private JPanel createPanel(JTextField input,JTextField output){
        JPanel panel=new JPanel(new GridLayout(1,3));
        JButton addButton=new JButton("+");
        JButton subtractButton=new JButton("-");
        JButton resetButton=new JButton("z");
       Add add=new Add(input,output,resetButton);
       addButton.addActionListener(add);
       subtractButton.addActionListener(new Subtract(input,output,resetButton));
       resetButton.addActionListener(new Reset(input,output,resetButton));
       resetButton.setEnabled(false);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(resetButton);

        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
