package com.martynenkoigor.javacore.chapter14;

public interface NumericTest2 {
    boolean test(int n, int d);
}

class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) System.out.println("Чиcлo 2 является множителем числа 10");
        if (!isFactor.test(10,3)) System.out.println("Чиcлo З не является множителем числа 10");
    }
}