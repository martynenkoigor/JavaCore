package com.martynenkoigor.javacore.chapter06;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a и оb.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a и оb.b после вызова: " + ob.a + " " + ob.b);
    }
}
