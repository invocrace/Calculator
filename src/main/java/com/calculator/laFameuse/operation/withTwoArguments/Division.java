package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;

public class Division extends OperationTwoArguments {
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


    @Override
    public double operation(double number, double number2) {
        this.number = number;
        this.number2 = number2;
       return operation();
    }
}

