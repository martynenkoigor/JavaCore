package com.martynenkoigor.javacore.chapter06;

public class Test {
    int a, b;

    public Test(int i, int j) {
        a = j;
        b = j;
    }

    public boolean equals(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

}
