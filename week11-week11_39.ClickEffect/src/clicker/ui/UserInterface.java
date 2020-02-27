package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {
    private JFrame frame;


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JLabel counter=new JLabel("0");
        JButton clickButton=new JButton("Click!");
        container.setLayout(new GridLayout(2,1));
        ClickListener clickListener=new ClickListener(new PersonalCalculator(),counter);
        clickButton.addActionListener(clickListener);
        container.add(counter);
        container.add(clickButton);

    }

    public JFrame getFrame() {
        return frame;
    }
}
