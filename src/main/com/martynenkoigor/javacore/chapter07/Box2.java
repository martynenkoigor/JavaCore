package com.martynenkoigor.javacore.chapter07;

public class Box2 {
    double width;
    double height;
    double depth;

    public Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box2(double len) {
        width = height = depth = len;
    }

    public Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box2 {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
