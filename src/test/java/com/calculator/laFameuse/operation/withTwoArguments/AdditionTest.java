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

}