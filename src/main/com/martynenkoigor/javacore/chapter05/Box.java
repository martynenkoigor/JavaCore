package com.martynenkoigor.javacore.chapter05;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}


class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(10,20,15);

        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.depth * mybox.height * mybox.width;

        System.out.println("Oбъeм равен " + vol);
    }
}