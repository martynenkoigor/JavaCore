package com.martynenkoigor.javacore.chapter15;

public class ConCat {
    public static void main(String[] args) {
        String longStr = "Это может быть очень длинная строка, " +
                "которую следовало бы перенести на " +
                "новую строку. Но благодаря сцеплению " +
                "этого удается избежать .";
        System.out.println(longStr);
    }
}
