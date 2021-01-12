package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class MultipleOperationsTest {

    @Test
    public void shouldChainSomeOperations(){

        OperationTwoArguments operationMother = new Addition();




        Operation operation = Mockito.mock(Operation.class);
        Mockito.doReturn(4.0).when(operation).operation();

        Operation operation2 = Mockito.mock(Operation.class);
        Mockito.doReturn(4.0).when(operation2).operation();

        MultipleOperations multipleOperations = new MultipleOperations();
        multipleOperations.setOperation1(operation);
        multipleOperations.setOperation2(operation2);

        assertEquals(8.0,multipleOperations.operation(),0.00001);












    }
}
