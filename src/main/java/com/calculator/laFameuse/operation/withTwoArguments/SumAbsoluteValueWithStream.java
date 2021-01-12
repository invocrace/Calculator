package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;
import javafx.util.Pair;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.IntStream;


public class SumAbsoluteValueWithStream implements Operation {
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

    private boolean verify(double number) {

        return isPaire(calculValueAbsolut(number)) ;

    }


    @Override
    public double operation() {

           if(list1.size() != list2.size()) {

        throw new  IllegalArgumentException ("la taille des listes n'est pas la même, merci de faire gaff bande de canard plus que laqué") ;

        } return IntStream.range(0, list1.size())
                .mapToObj(i -> new Pair<>(list1.get(i), list2.get(i)))
                .filter(ligne -> verify(ligne.getKey()) && verify(ligne.getValue()))
                .mapToDouble(i -> {
                    if (Math.abs(i.getKey()) >= Math.abs(i.getValue())) {
                        return i.getKey();
                    } else return i.getValue();
                })
                .sum();
    }



}