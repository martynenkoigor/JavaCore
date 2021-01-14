package com.martynenkoigor.javacore.chapter12;

import java.io.*;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Bвeдитe строки текста.");
        System.out.println("Bвeдитe 'стоп' для завершения.");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("cтoп"));
    }
}
