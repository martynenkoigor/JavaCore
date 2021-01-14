package com.martynenkoigor.javacore.chapter12;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Oшибкa чтения из файла");
        }

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Oшибкa закрытия файла");
        }
    }
}
