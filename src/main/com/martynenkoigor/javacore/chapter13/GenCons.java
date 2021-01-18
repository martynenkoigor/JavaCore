package com.martynenkoigor.javacore.chapter13;

public class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    void showval() {
        System.out.println("val: " + val);
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons tets2 = new GenCons(123.5F);

        test.showval();
        tets2.showval();
    }
}