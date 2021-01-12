package com.calculator.laFameuse.operation.withTwoArguments;

import com.calculator.laFameuse.operations.Operation;

import java.util.ArrayList;

public class SumAbsoluteValueWithOutStream implements Operation {

    private ArrayList<Double> list1;
    private ArrayList<Double> list2;


    public ArrayList<Double> getList1() {
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


    @Override
    public double operation() {
        double somme = 0;

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("iteration num : "+i);

            if (Math.abs(list1.get(i)) % 2 == 0 && Math.abs(list2.get(i)) % 2 == 0) {
                if(Math.abs(list1.get(i)) >= Math.abs(list2.get(i))) {
                    somme = somme + list1.get(i);
                    System.out.println("iteration num : "+i+" somme est égale à : "+somme);
                }else somme = somme + list2.get(i);
                System.out.println("iteration num : "+i+" somme est égale à : "+somme);
            }

        }return somme;
    }
}