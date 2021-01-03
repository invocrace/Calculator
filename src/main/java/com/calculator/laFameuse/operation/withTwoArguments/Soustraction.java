package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;

public class Soustraction implements Operation {
    private double number;
    private double number2;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    @Override
    public double operation() {
        return this.number - this.number2;

    }

}
