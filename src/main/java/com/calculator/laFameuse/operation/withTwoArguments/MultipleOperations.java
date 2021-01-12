package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operation.withTwoArguments.OperationTwoArguments;
import com.calculator.laFameuse.operations.Operation;

public class MultipleOperations implements Operation {
    private OperationTwoArguments operationMother;
    private Operation operation1;
    private Operation operation2;

    public OperationTwoArguments getOperationMother() {
        return operationMother;
    }

    public void setOperationMother(OperationTwoArguments operationMother) {
        this.operationMother = operationMother;
    }

    public Operation getOperation1() {
        return operation1;
    }

    public void setOperation1(Operation operation1) {
        this.operation1 = operation1;
    }

    public Operation getOperation2() {
        return operation2;
    }

    public void setOperation2(Operation operation2) {
        this.operation2 = operation2;
    }

    public double operation() {
        operationMother.setNumber(this.operation1.operation());
        operationMother.setNumber2(this.operation2.operation());

        return operationMother.operation();
    }
}