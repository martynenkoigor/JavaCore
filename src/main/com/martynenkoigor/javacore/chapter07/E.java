package com.martynenkoigor.javacore.chapter07;

public class E {
    void callme() {
        System.out.println("B методе callme() из класса E");
    }
}
class F extends E {
    void callme() {
        System.out.println("B методе callme() из класса F");
    }
}
class J extends E {
    void callme() {
        System.out.println("B методе callme() из класса J");
    }
}
