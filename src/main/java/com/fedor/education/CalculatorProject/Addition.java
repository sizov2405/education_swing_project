package com.fedor.education.CalculatorProject;

public class Addition implements Calculator{
    @Override
    public double calculate(double first, double second) {
        return first + second;
    }
}
