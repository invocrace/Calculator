package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultipleOperationsTest {

    @Test
    public void shouldChainSomeOperations(){
        Operation operation = new Addition();
        Operation operation2 = new Soustraction();
        OperationTwoArguments operationMother = new Addition();
        MultipleOperations multipleOperations = new MultipleOperations();

        multipleOperations.setOperation2(operation);
        multipleOperations.setOperation3(operation2);
        multipleOperations.setOperationMother(operationMother);

        assertEquals(8,multipleOperations.multipleOperations(),0.0000001);
    }
}
