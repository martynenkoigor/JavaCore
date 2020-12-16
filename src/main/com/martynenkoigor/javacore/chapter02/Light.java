package com.martynenkoigor.javacore.chapter02;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long distance;
        long days;
        long seconds;

        lightspeed = 18600;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("Зa " + days );
        System.out.print(" дней свет пройдет около ");
        System.out.println( distance + " миль.");
    }
}
