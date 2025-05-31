package com.fedor.education.CalculatorProject.factory;

import javax.swing.*;
import java.awt.*;

public class ButtonFactory {

    public static JButton createButton(String text,
                                       Bounds bounds,
                                       boolean focusable,
                                       Color background,
                                       Font font) {
        JButton button = new JButton(text);
        button.setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        button.setFocusable(focusable);
        button.setBackground(background);
        button.setFont(font);
        return button;
    }
}
