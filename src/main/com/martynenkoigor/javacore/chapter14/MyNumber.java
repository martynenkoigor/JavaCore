package com.martynenkoigor.javacore.chapter14;

public interface MyNumber {
    double getValue();
}

class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;

        myNum = () -> 123.45;

        System.out.println("Фиксированное значение: " + myNum.getValue());

        myNum = () -> Math.random() * 100;

        System.out.println("Cлyчaйнoe значение : " + myNum.getValue());
        System.out.println("Еще одно случайное значение: " + myNum.getValue());
    }
}
