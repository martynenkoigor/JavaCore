package com.martynenkoigor.javacore.chapter06;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;

        System.out.println("Длинa строки strOb1: " + strOb1.length());
        System.out.println("Cимвoл по индексу 3 в строке strOb1: " + strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == str0b2");
        else
            System.out.println("strOb1 != str0b2");

        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strObЗ");
        else
            System.out.println("strOb1 != strObЗ");
    }
}
