package com.martynenkoigor.javacore.chapter01;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("Знaчeниe х: " + x);
            System.out.println("Знaчeниe у: " + y);
            y = y - 2;
        }

    }
}
