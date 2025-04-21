package com.fedor.education;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Desktop extends JFrame
{

    private JLabel label;
    private JButton button;

    private Integer value = 0;

    public Desktop() {
        setTitle("Button and Label Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel(value.toString());
        button = new JButton("Нажмите чтоб увеличить счетчик на 1");
        button.addActionListener(getButtonClickListener());

        add(label);
        add(button);

        setVisible(true);
    }

    private ActionListener getButtonClickListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer newValue = value++;
                label.setText(newValue.toString());
            }
        };
    }

}
