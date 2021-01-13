package com.martynenkoigor.javacore.chapter11;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = iOb + dOb;
        System.out.println("dOb после выражения: " + dOb);
    }
}
