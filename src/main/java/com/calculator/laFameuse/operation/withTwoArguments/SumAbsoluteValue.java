package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;

import java.util.List;


public class SumAbsoluteValue implements Operation {
    ArrayList<Double> list1;
    ArrayList<Double> list2;


    public List<Double> getList1() {
        return list1;
    }

    public void setList1(ArrayList<Double> list1) {
        this.list1 = list1;
    }

    public ArrayList<Double> getList2() {
        return list2;
    }

    public void setList2(ArrayList<Double> list2) {
        this.list2 = list2;
    }

    private double calculValueAbsolut(double number) {
        return Math.abs(number);
    }

    private boolean isPaire(double number) {
        return number % 2 == 0;
    }

    private double verify(double number) {

        if (isPaire(calculValueAbsolut(number))) ;
        return calculValueAbsolut(number);
    }


    @Override
    public double operation() {


        for (int i = 0 ; i<list1.size();i++) {
            Pair<Double,Double> nouvellePair = new Pair(). <Double, Double>(list1.get(i), list2.get(i))) {

            }
            List<Pair<Double, Double>> pairList = new ArrayList<Pair<Double, Double>>();
        }


    }



}