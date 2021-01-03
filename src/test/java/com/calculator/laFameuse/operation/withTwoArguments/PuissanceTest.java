package com.calculator.laFameuse.operation.withTwoArguments;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PuissanceTest {

    @Test
    public void power(){
        Puissance puissance = new Puissance();

        puissance.setNumber(2);
        puissance.setNumber2(3);
        assertEquals(8,puissance.operation(),0.000001);
    }

}