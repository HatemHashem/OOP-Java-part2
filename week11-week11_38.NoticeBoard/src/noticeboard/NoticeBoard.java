package noticeboard;

import javax.swing.*;
import java.awt.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,200));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3,1));
        JTextField userText=new JTextField();
        JButton copyButton=new JButton("Copy!");
        JLabel copiedText=new JLabel("I was copied here from the JTextArea");
        ActionEventListener copyAction=new ActionEventListener(userText,copiedText);
        copyButton.addActionListener(copyAction);

        container.add(userText);
        container.add(copyButton);
        container.add(copiedText);
    }
}
