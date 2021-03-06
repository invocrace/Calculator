package com.calculator.laFameuse.operation.withTwoArguments;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class SumAbsoluteValueTest {

@Test
   public void ShouldReturnZeroOperationTest(){

       ArrayList<Double> list1 = new ArrayList<Double>();
       list1.add(1.0);
       list1.add(2.0);
       list1.add(2.0);
       list1.add(-4.0);

       ArrayList<Double> list2 = new ArrayList<Double>();
       list2.add(2.0);
       list2.add(1.0);
       list2.add(4.0);
       list2.add(2.0);

       SumAbsoluteValueWithStream sumAbsoluteValueWithStream = new SumAbsoluteValueWithStream();
       sumAbsoluteValueWithStream.setList1(list1);
       sumAbsoluteValueWithStream.setList2(list2);

       assertEquals(0.0, sumAbsoluteValueWithStream.operation(),0.000001);


       }


   }
