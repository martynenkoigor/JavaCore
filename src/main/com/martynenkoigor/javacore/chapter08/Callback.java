package com.martynenkoigor.javacore.chapter08;

public interface Callback {
    void callback(int param);
}
class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }
    void nonIFaceMeth() {
        System.out.println("B классах, реализующих интерфейсы," + "могут определяться и другие члены .");
    }
}
class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}