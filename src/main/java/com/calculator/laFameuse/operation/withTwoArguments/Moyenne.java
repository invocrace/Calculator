package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;

import java.util.List;
import java.util.OptionalDouble;

public class Moyenne implements Operation {

private  List<Double> nombres;

    public List<Double> getNombres() {
        return nombres;
    }

    public void setNombres(List<Double> nombres) {
        this.nombres = nombres;
    }

    @Override
    public double operation() {
        OptionalDouble res = this.nombres.stream()
                .mapToDouble(n -> n)
                .average();
        return res.getAsDouble();
    }
}
