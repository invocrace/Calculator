package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;

public class MultipleOperations {
    OperationTwoArguments operationMother;
    Operation operation2;
    Operation operation3;

    public OperationTwoArguments getOperationMother() {
        return operationMother;
    }

    public void setOperationMother(OperationTwoArguments operationMother) {
        this.operationMother = operationMother;
    }

    public Operation getOperation2() {
        return operation2;
    }

    public void setOperation2(Operation operation2) {
        this.operation2 = operation2;
    }

    public Operation getOperation3() {
        return operation3;
    }

    public void setOperation3(Operation operation3) {
        this.operation3 = operation3;
    }

    public double multipleOperations(){
        double res1 = this.operation2.operation();
        double res2 = this.operation3.operation();

       return operationMother.operation(res1,res2);
    }
}
