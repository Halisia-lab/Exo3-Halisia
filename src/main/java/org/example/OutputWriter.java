package org.example;

import java.util.List;

import static java.lang.Integer.parseInt;

public class OutputWriter {
    List<String> lines;
    int currentResult;

    public OutputWriter(List<String> lines) {
        this.lines = lines;
        this.currentResult = 0;
    }

    public void writeInConsole() {
        for (String line: this.lines
             ) {
            currentResult += parseInt(line);
            Calculator calculator = new Calculator('+', currentResult);
            System.out.println(calculator.calculate(parseInt(line)));
        };
    }
}
