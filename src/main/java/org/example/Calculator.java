package org.example;

public class Calculator {
    int operator;
    int currentResult;


    public Calculator(char operator, int currentResult) {
        this.operator = operator;
        this.currentResult = currentResult;
    }

    public String calculate(int newNumber) {
        String lineResult = "";
        switch (this.operator) {
            case'+':
                this.currentResult = this.currentResult + newNumber;
            case '-':
                this.currentResult = this.currentResult - newNumber;
            default:
                this.currentResult = 0;

        }
        lineResult = newNumber + " (=" + this.currentResult+ ")";
        return lineResult;
    }
}
