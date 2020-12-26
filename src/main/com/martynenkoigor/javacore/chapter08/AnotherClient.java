package com.martynenkoigor.javacore.chapter08;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.print("Eщe один вариант метода callback(): ");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
class TestInterface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;

        c.callback(42);
    }
}