package com.martynenkoigor.javacore.chapter20;

import java.io.FileReader;
import java.io.IOException;

public class FIleReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("FileReaderDemo.java")) {
            int c;

            while ((c = fr.read()) != -1) System.out.println((char) c);
        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода : " + e);
        }
    }
}
