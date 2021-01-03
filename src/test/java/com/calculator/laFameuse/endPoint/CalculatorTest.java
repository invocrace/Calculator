package com.calculator.laFameuse.endPoint;

import com.calculator.laFameuse.operation.withTwoArguments.Addition;
import com.calculator.laFameuse.operation.withTwoArguments.Operation;
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