package movingfigure;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;

    public UserInterface(Figure figure) {
        this.figure = figure;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard drawingBoard=new DrawingBoard(this.figure);
       container.add(drawingBoard);
       frame.addKeyListener(new KeyboardListener(drawingBoard,this.figure));

    }

    private void addListeners() {
    }

    public JFrame getFrame() {
        return frame;
    }
}
