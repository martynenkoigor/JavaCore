package com.martynenkoigor.javacore.chapter15;

public class insertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mнe Java!");
        sb.insert(4, "нравится ");
        System.out.println(sb);
    }
}
