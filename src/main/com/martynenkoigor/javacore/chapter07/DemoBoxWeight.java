package com.martynenkoigor.javacore.chapter07;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Bec mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Bec mybox2 равен " + mybox2.weight);
        System.out.println();

    }
}