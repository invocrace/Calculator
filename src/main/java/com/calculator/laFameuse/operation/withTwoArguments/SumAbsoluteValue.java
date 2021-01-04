package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;
import javafx.util.Pair;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Stream;


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

    private double calculValueAbsolut(double number){
        return Math.abs(number);
    }

    private boolean isPaire(double number){
        return number % 2 == 0;
    }

    private boolean verify(double number){

            return isPaire(calculValueAbsolut(number));
    }


    @Override
    public double operation() {
    Pair<ArrayList,ArrayList> pair= new Pair<ArrayList,ArrayList>(list1,list2);

    Stream.of(pair)
            .map( Pair::getKey)
            .map( i -> verify(getList1().get(i)) + verify(getList2().get(i)));





        return 0;

    }
}
