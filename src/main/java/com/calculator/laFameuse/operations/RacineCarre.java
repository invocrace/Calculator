package com.calculator.laFameuse.operations;

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