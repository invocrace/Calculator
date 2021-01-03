package com.calculator.laFameuse.operation.withTwoArguments;

public class Division implements Operation {
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
        if (number2 != 0) {
            return this.number / this.number2;
        }else
        {throw new IllegalArgumentException("problème de division");
        }
    }


}
