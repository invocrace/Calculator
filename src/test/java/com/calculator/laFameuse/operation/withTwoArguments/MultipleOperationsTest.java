package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.endPoint.MultipleOperations;
import com.calculator.laFameuse.operations.Operation;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class MultipleOperationsTest {

    @Test
    public void shouldChainSomeOperations(){
        OperationTwoArguments operationMother = new Addition();
        MultipleOperations multipleOperations = new MultipleOperations();

        Operation operation = Mockito.mock(Operation.class);
        Mockito.doReturn(4.0).when(operation).operation();

        Operation operation2 = Mockito.mock(Operation.class);
        Mockito.doReturn(4.0).when(operation2).operation();

        assertEquals(8.0,multipleOperations.multipleOperations(operationMother,operation,operation2),0.00001);












    }
}
