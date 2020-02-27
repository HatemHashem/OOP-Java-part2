package survey;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        JLabel firstQuestion = new JLabel("Are you?");
        container.add(firstQuestion);
        JCheckBox yesJRadioButton = new JCheckBox("Yes!");
        JCheckBox noJRadioButton = new JCheckBox("No!");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yesJRadioButton);
        buttonGroup.add(noJRadioButton);
        container.add(yesJRadioButton);
        container.add(noJRadioButton);

        JLabel secondQuestion=new JLabel("Why?");
        container.add(secondQuestion);
        JRadioButton firstJRadioButton=new JRadioButton("No reason.");
        JRadioButton secondJRadioButton=new JRadioButton("Because it is fun!");
        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(firstJRadioButton);
        buttonGroup2.add(secondJRadioButton);
        container.add(firstJRadioButton);
        container.add(secondJRadioButton);
        JButton doneJButton=new JButton("Done!");
        container.add(doneJButton);


    }


    public JFrame getFrame() {
        return frame;
    }
}
