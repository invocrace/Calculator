package com.calculator.laFameuse.endPoint;

import com.calculator.laFameuse.operations.Operation;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void resOperationTest() {
        Calculator calculator = new Calculator();
        Operation operation = Mockito.mock(Operation.class);
        Mockito.doReturn(8.0).when(operation).operation();
        assertEquals(8.0, calculator.resOperation(operation), 0.00001);
    }

}