package org.example;

public class Calculator {
    char operator;
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
                break;
            case '-':
                this.currentResult = this.currentResult - newNumber;
                break;
            default:
                this.currentResult = 0;
                break;
        }

        lineResult = this.operator +""+ newNumber + " (=" + this.currentResult+ ")";
        return lineResult;
    }
}
