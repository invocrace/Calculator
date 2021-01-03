package com.calculator.laFameuse.endPoint;

import com.calculator.laFameuse.operation.withTwoArguments.OperationTwoArguments;
import com.calculator.laFameuse.operations.Operation;

public class MultipleOperations {
Calculator calculator = new Calculator();
    public double multipleOperations(OperationTwoArguments operationMother, Operation operation1, Operation operation2){
        return operationMother.operation( calculator.resOperation(operation1),calculator.resOperation(operation2));
    }
}
