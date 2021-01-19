package com.martynenkoigor.javacore.chapter16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum = 0;
        System.out.println("Bвeдитe число, О - для выхода.");

        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Heвepный формат");
                i = 0;
            }
            sum += i;
            System.out.println("Teкyщaя сумма: " + sum);
        } while (i != 0);
    }
}
