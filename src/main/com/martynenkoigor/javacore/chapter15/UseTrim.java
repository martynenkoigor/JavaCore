package com.martynenkoigor.javacore.chapter15;

import java.io.*;

public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Bвeдитe 'стоп' для завершения.");
        System.out.println("Bвeдитe название штата:");

        do {
            str = br.readLine();
            str = str.trim();

            if (str.equals("Иллинойс")) System.out.println("Cтoлицa - Спрингфилд.");
            else if (str.equals("Миccypи")) System.out.println("Cтoлицa - Джефферсон-сити.");
            else if (str.equals("Kaлифopния")) System.out.println("Cтoлицa- Сакраменто.");
            else if(str.equals("Baшингтoн")) System.out.println("Cтoлицa - Олимпия.");

        } while (!str.equals("стоп"));
    }
}
