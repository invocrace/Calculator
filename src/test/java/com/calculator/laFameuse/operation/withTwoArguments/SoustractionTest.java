package com.calculator.laFameuse.operation.withTwoArguments;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoustractionTest {

    @Test
    public void subtractionTest(){
        Soustraction soustraction = new Soustraction();
        soustraction.setNumber(6);
        soustraction.setNumber2(4);
        assertEquals(2.0,soustraction.operation(),0.000001);
    }

}