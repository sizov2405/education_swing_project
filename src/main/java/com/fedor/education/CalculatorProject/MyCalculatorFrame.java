package com.fedor.education.CalculatorProject;

import com.fedor.education.CalculatorProject.factory.Bounds;
import com.fedor.education.CalculatorProject.factory.ButtonFactory;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculatorFrame extends JFrame implements ActionListener {

    private Font buttonFont18 = new Font("Consolas",Font.ROMAN_BASELINE,18);

    JButton some_space_btn;
    JButton num0;
    JButton dot_btn;
    JButton equals_button;
    JButton num1;
    JButton num2;
    JButton num3;
    JButton plus_button;
    JButton num4;
    JButton num5;
    JButton num6;
    JButton minus_button;
    JButton num7;
    JButton num8;
    JButton num9;
    JButton multiply_button;
    JButton oneDivideByX;
    JButton xSquare;
    JButton squareRootOfX;
    JButton divide;
    JButton percent_btn;
    JButton CE_btn;
    JButton C_button;
    JButton deleteLast_btn;

    JTextField textField;

    double first_number;
    String operation;
    double second_number;
    double result;

    Calculator calc;

    public MyCalculatorFrame(){
        this.setSize(340,540);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("My Calculator");
        this.setResizable(false);
        ImageIcon imageIcon = new ImageIcon("calculator_image.jpg");
        this.setIconImage(imageIcon.getImage());
        this.setLayout(null);

        some_space_btn = new JButton("+/-");
        some_space_btn.setBounds(5,450,76,45);
        some_space_btn.setFocusable(false);
        some_space_btn.setBackground(Color.white);
        some_space_btn.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        some_space_btn.setEnabled(false);
        num0 = new JButton("0");
        num0.setBounds(85,450,76,45);
        num0.setFocusable(false);
        num0.setBackground(Color.white);
        num0.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        dot_btn = new JButton(".");
        dot_btn.setBounds(165,450,76,45);
        dot_btn.setFocusable(false);
        dot_btn.setBackground(Color.white);
        dot_btn.setFont(new Font("Consolas",Font.ROMAN_BASELINE,20));
        equals_button = new JButton("=");
        equals_button.setBounds(245,450,76,45);
        equals_button.setFocusable(false);
        equals_button.setBackground(Color.blue);
        equals_button.setForeground(Color.white);
        equals_button.setFont(new Font("Consolas",Font.ROMAN_BASELINE,24));
        num1 = new JButton("1");
        num1.setBounds(5,400,76,45);
        num1.setFocusable(false);
        num1.setBackground(Color.white);
        num1.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        num2 = new JButton("2");
        num2.setBounds(85,400,76,45);
        num2.setFocusable(false);
        num2.setBackground(Color.white);
        num2.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        num3 = new JButton("3");
        num3.setBounds(165,400,76,45);
        num3.setFocusable(false);
        num3.setBackground(Color.white);
        num3.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        plus_button = new JButton("+");
        plus_button.setBounds(245,400,76,45);
        plus_button.setFocusable(false);
        plus_button.setBackground(Color.white);
        plus_button.setFont(new Font("Consolas",Font.ROMAN_BASELINE,20));
        num4 = new JButton("4");
        num4.setBounds(5,350,76,45);
        num4.setFocusable(false);
        num4.setBackground(Color.white);
        num4.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        num5 = new JButton("5");
        num5.setBounds(85,350,76,45);
        num5.setFocusable(false);
        num5.setBackground(Color.white);
        num5.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        num6 = new JButton("6");
        num6.setBounds(165,350,76,45);
        num6.setFocusable(false);
        num6.setBackground(Color.white);
        num6.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        minus_button = new JButton("-");
        minus_button.setBounds(245,350,76,45);
        minus_button.setFocusable(false);
        minus_button.setBackground(Color.white);
        minus_button.setFont(new Font("Consolas",Font.ROMAN_BASELINE,20));
        num7 = new JButton("7");
        num7.setBounds(5,300,76,45);
        num7.setFocusable(false);
        num7.setBackground(Color.white);
        num7.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        num8 = new JButton("8");
        num8.setBounds(85,300,76,45);
        num8.setFocusable(false);
        num8.setBackground(Color.white);
        num8.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        num9 = ButtonFactory.createButton("9", new Bounds(165,300,76,45), false, Color.white, buttonFont18, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberButtonClick("9");
            }
        });

        multiply_button = new JButton("×");
        multiply_button.setBounds(245,300,76,45);
        multiply_button.setFocusable(false);
        multiply_button.setBackground(Color.white);
        multiply_button.setFont(new Font("Consolas",Font.ROMAN_BASELINE,20));
        oneDivideByX= new JButton("1/x");
        oneDivideByX.setBounds(5,250,76,45);
        oneDivideByX.setFocusable(false);
        oneDivideByX.setBackground(Color.white);
        oneDivideByX.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        xSquare = new JButton("x²");
        xSquare.setBounds(85,250,76,45);
        xSquare.setFocusable(false);
        xSquare.setBackground(Color.white);
        xSquare.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        squareRootOfX = ButtonFactory.createButton("√x", new Bounds(165, 250, 76, 45), false, Color.white, buttonFont18, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Добавь все действия в  Operations
                actionButtonClick(Operations.SQUARE_ROOT);
            }
        });
        divide = new JButton("÷");
        divide.setBounds(245,250,76,45);
        divide.setFocusable(false);
        divide.setBackground(Color.white);
        divide.setFont(new Font("Consolas",Font.ROMAN_BASELINE,20));
        percent_btn = new JButton("%");
        percent_btn.setBounds(5,200,76,45);
        percent_btn.setFocusable(false);
        percent_btn.setBackground(Color.white);
        percent_btn.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        percent_btn.setEnabled(false);
        CE_btn = new JButton("CE");
        CE_btn.setBounds(85,200,76,45);
        CE_btn.setFocusable(false);
        CE_btn.setBackground(Color.white);
        CE_btn.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        CE_btn.setEnabled(false);
        C_button = new JButton("C");
        C_button.setBounds(165,200,76,45);
        C_button.setFocusable(false);
        C_button.setBackground(Color.white);
        C_button.setForeground(Color.red);
        C_button.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        deleteLast_btn = new JButton("←");
        deleteLast_btn.setBounds(245,200,76,45);
        deleteLast_btn.setFocusable(false);
        deleteLast_btn.setBackground(Color.white);
        deleteLast_btn.setFont(new Font("Consolas",Font.ROMAN_BASELINE,18));
        deleteLast_btn.setEnabled(false);

        num1.addActionListener(this);
        num0.addActionListener(this);
        dot_btn.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        plus_button.addActionListener(this);
        minus_button.addActionListener(this);
        equals_button.addActionListener(this);
        multiply_button.addActionListener(this);
        divide.addActionListener(this);
        C_button.addActionListener(this);
        xSquare.addActionListener(this);
        squareRootOfX.addActionListener(this);
        oneDivideByX.addActionListener(this);

        textField = new JTextField();
        textField.setText("0");
        textField.setBounds(4,95,318,75);
        textField.setEditable(false);
        textField.setFont(new Font("Consolas",Font.ROMAN_BASELINE,30));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setCaretColor(new Color(0,0,0,0));
        textField.setBorder(new LineBorder(Color.black,3));




        this.add(some_space_btn);
        this.add(num0);
        this.add(dot_btn);
        this.add(equals_button);
        this.add(num1);
        this.add(num2);
        this.add(num3);
        this.add(plus_button);
        this.add(num4);
        this.add(num5);
        this.add(num6);
        this.add(minus_button);
        this.add(num7);
        this.add(num8);
        this.add(num9);
        this.add(multiply_button);
        this.add(oneDivideByX);
        this.add(xSquare);
        this.add(squareRootOfX);
        this.add(divide);
        this.add(percent_btn);
        this.add(CE_btn);
        this.add(C_button);
        this.add(deleteLast_btn);
        this.add(textField);


        this.setVisible(true);
    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == num0){
            deleteZero();
            textField.setText(textField.getText() + "0");
        }  else if (e.getSource() == num1) {
            deleteZero();
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == num2) {
            deleteZero();
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == num3) {
            deleteZero();
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == dot_btn) {
            deleteZero();
            textField.setText(textField.getText() + ".");
        } else if (e.getSource() == num4) {
            deleteZero();
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == num5) {
            deleteZero();
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == num6) {
            deleteZero();
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == num7) {
            deleteZero();
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == num8) {
            deleteZero();
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == num9) {
            deleteZero();
            textField.setText(textField.getText() + "9");
        }

        else if(e.getSource() == plus_button){
            calc = CalculatorFactory.getCalculator(Operations.ADD);
            first_number = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if(e.getSource() == minus_button){
            calc = CalculatorFactory.getCalculator(Operations.SUBTRACT);
            first_number = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if(e.getSource() == multiply_button){
            calc = CalculatorFactory.getCalculator(Operations.MULTIPLY);
            first_number = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if(e.getSource() == divide){
            calc = CalculatorFactory.getCalculator(Operations.DIVIDE);
            first_number = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if(e.getSource() == xSquare){
            operation = "**";
            first_number = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if(e.getSource() == squareRootOfX){
            first_number = Double.parseDouble(textField.getText());
            operation = "sqrt";
            textField.setText("");
        } else if(e.getSource() == oneDivideByX){
            first_number = Double.parseDouble(textField.getText());
            operation = "1/x";
            textField.setText("");
        }

        else if (e.getSource() == equals_button) {
                second_number =  Double.parseDouble(textField.getText());
                if(calc != null){
                    result = calc.calculate(first_number,second_number);
                }
            textField.setText(String.valueOf(result));
        }

        else if(e.getSource() == C_button){
            first_number = 0;
            second_number = 0;
            result = 0;
            textField.setText("0");
        }



    }

    private void numberButtonClick(String buttonText) {
        deleteZero();
        textField.setText(textField.getText() + buttonText);
    }

    private void actionButtonClick(Operations operations) {
        calc = CalculatorFactory.getCalculator(operations);
        first_number = Double.parseDouble(textField.getText());
        textField.setText("");
    }

    public void deleteZero(){
        if(textField.getText().equals("0")){
            textField.setText("");
        }
    }



    public static void main(String[] args) {
        MyCalculatorFrame calculatorFrame = new MyCalculatorFrame();
    }

}
