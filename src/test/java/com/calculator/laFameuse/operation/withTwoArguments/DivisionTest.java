package com.calculator.laFameuse.operation.withTwoArguments;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

    @Test
    public void divisionTest(){
        Division division = new Division();

        division.setNumber(8);
        division.setNumber2(4);

        assertEquals(2,division.operation(),0.000001);
    }

    @Test(expected = IllegalArgumentException.class)

    public void divisionTestByZeroMakeError() {
        Division division = new Division();

        division.setNumber(8);
        division.setNumber2(0);
        division.operation();
    }

}