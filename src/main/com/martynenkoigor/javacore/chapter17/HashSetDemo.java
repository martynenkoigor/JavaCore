package com.martynenkoigor.javacore.chapter17;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Бета");
        hs.add("Aльфa");
        hs.add("Этa");
        hs.add("Гaммa");
        hs.add("Эпсилон");
        hs.add("Oмeгa");

        System.out.println(hs);
    }
}
