package com.martynenkoigor.javacore.chapter13;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob =o;
    }
    T getob() {
        return ob;
    }
    void showType() {
        System.out.println("Tипoм Т является " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getob();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Тест обобщений");

        strOb.showType();

        String str = strOb.getob();
        System.out.println( "Знaчeниe : " + str);
    }
}
