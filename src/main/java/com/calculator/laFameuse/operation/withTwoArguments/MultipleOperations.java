package com.calculator.laFameuse.operation.withTwoArguments;

public class MultipleOperations {
    Operation operation;
    Operation operation2;
    Operation operation3;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
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

    public Operation multipleOperations(){
        double res1 = this.operation2.operation();
        double res2 = this.operation3.operation();

        return this.operation.operation(res1,res2);
    }
}
