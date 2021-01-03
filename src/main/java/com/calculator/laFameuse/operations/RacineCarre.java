package com.calculator.laFameuse.operations;

import com.calculator.laFameuse.operation.withTwoArguments.Operation;

public class RacineCarre implements Operation {

    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public double operation() {

        return Math.sqrt(this.number);
    }
}