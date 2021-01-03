package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultipleOperationsTest {

    @Test
    public void shouldChainSomeOperations(){
        Operation operation = new Addition();
        double res1;
        double res2;

        assertEquals(8,operation.operation(),0.0001);
    }
}
