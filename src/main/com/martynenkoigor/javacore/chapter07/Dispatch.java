package com.martynenkoigor.javacore.chapter07;

public class Dispatch {
    public static void main(String[] args) {
         E e = new E();
         F f = new F();
         J j = new J();

         E r;

         r = e;
         r.callme();

         r = f;
         r.callme();

         r = j;
         r.callme();
    }
}
