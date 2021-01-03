package com.calculator.laFameuse.operation.withTwoArguments;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {

    @Test
    public void multiplicationTest(){
        Multiplication multiplication = new Multiplication();

        multiplication.setNumber(4);
        multiplication.setNumber2(4);
        assertEquals(16,multiplication.operation(),0.000001);
    }
}