package com.martynenkoigor.javacore.chapter16;

public class X {
    int a;
    float b;
}
class Y extends X {
    double c;
}
class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;
        clObj = x.getClass();
        System.out.println("x - объект типа: " + clObj.getName());
        clObj = y.getClass();
        System.out.println("y - объект типа: " + clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("Cyпepклacc объекта у : " + clObj.getName());
    }
}