package clicker.ui;

import clicker.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private Calculator personalCalculator;
    private JLabel counterLabel;

    public ClickListener(Calculator personalCalculator, JLabel counterLabel) {
        this.personalCalculator = personalCalculator;
        this.counterLabel = counterLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        personalCalculator.increase();
        counterLabel.setText(String.valueOf(personalCalculator.giveValue()));

    }
}
