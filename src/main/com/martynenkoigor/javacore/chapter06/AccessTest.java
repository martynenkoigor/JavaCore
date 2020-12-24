package com.martynenkoigor.javacore.chapter06;

public class AccessTest {
    public static void main(String[] args) {
        TestModificator ob = new TestModificator();

        ob.a = 10;
        ob.b = 20;
        ob.setC(100);

        System.out.println("a, b, и с: " + ob.a + " " + ob.b +
                " " + ob.getC());
    }
}
