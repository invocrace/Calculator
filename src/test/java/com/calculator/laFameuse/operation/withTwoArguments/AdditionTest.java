package com.calculator.laFameuse.operation.withTwoArguments;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class AdditionTest {


    @Test
    public void additionTest(){
        Addition addition = new Addition();
        addition.setNumber(4);
        addition.setNumber2(4);

        assertEquals(8.0,addition.operation(),0.000001);
    }

    @Test
    public void additionWithRwoOperationArgumentsTest() {
        Addition operationMother = new Addition();

        Operation operation1 = Mockito.mock(Operation.class);
        Mockito.doReturn(8.0).when(operation1).operation();

        Operation operation2 = Mockito.mock(Operation.class);
        Mockito.doReturn(8.0).when(operation2).operation();

        assertEquals(16.0, operationMother.operation(operation1,operation2),0.0001);

    }

}