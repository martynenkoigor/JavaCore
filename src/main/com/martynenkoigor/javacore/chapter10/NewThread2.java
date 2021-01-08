package com.martynenkoigor.javacore.chapter10;

public class NewThread2 implements Runnable {
    String name;
    Thread t;

    NewThread2(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("Oдин");
        new NewThread2("Двa");
        new NewThread2("Tpи");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен.");
    }
}