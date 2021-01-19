package com.martynenkoigor.javacore.chapter16;

public class Elapsed {
    public static void main(String[] args) {
        long start, end;

        System.out.println("Измерение времени перебора от О до 100000000 ");
        start = System.currentTimeMillis();

        for (long i = 0; i < 100000000L; i++);
            end = System.currentTimeMillis();
        System.out.println("Bpeмя выполнения : " + (end - start));
    }
}
