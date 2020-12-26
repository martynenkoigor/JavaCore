package com.martynenkoigor.javacore.chapter06;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    public class Inner {
        void display() {
            System.out.println("вывoд: outer х = " + outer_x);
        }
    }
}

class InnerClassdemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
