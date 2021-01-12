package com.martynenkoigor.javacore.chapter11;

public enum Apple1 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple1(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;

        System.out.println("Яблoкo сорта Winesap стоит " + Apple1.Winesap.getPrice() + " центов.\n");

        System.out.println("Цeны на все сорта яблок : ");
        for (Apple1 a : Apple1.values())
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
    }
}
