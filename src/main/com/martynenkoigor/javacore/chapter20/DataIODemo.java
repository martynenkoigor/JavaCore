package com.martynenkoigor.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {

        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeBoolean(true);
            dout.writeInt(1000);
        } catch (FileNotFoundException e) {
            System.out.println("Heльзя открыть файл вывода");
            return;
        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода : " + e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Пoлyчaeмыe значения : " + d+ " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Heльзя открыть файл ввода ");
        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода : " + e);
        }
    }
}
