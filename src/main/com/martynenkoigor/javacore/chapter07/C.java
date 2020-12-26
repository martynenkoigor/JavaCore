package com.martynenkoigor.javacore.chapter07;

public class C {
    int i;
}

class D extends C {
    int i;

    D(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}
