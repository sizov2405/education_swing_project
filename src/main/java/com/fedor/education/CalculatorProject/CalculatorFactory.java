package com.fedor.education.CalculatorProject;

public class CalculatorFactory {

    public static Calculator getCalculator(Operations type){
        if(type == Operations.ADD){
            return new Addition();
        } else if(type == Operations.SUBTRACT){
            return new Subtraction();
        } else if(type == Operations.MULTIPLY){
            return new Multiply();
        } else if (type == Operations.DIVIDE) {
            return new Division();
        }
        throw new IllegalArgumentException();
    }
}
