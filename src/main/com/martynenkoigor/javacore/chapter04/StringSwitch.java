package com.martynenkoigor.javacore.chapter04;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "два";

        switch(str) {
            case "один":
                System.out.println("oдин");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("тpи");
                break;
            default:
                System.out.println("нe совпало)");
                break;
        }
    }
}
