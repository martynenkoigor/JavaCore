package com.martynenkoigor.javacore.chapter06;

public class Test {
    int a, b;

    public Test(int i) {
        a = i;
    }

    public Test(int i, int j) {
        a = i;
        b = j;
    }

    public Test incrByTen() {
        Test temp = new Test(a + 10);
             return temp;
    }



    public boolean equals(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    public void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

}
