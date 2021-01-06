package com.martynenkoigor.javacore.chapter09;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("дeмoнcтpaция") ;
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc().");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Пoвтopный перехват: " + e);
        }
    }
}
