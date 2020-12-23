package com.martynenkoigor.javacore.chapter05;

public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}


class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();

        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.depth * mybox.height * mybox.width;

        System.out.println("Oбъeм равен " + vol);
    }
}