package com.martynenkoigor.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("START");

        new MyNewThread(cb, "A");
        new MyNewThread(cb, "B");
        new MyNewThread(cb, "C");
    }
}

class MyNewThread implements Runnable{
    CyclicBarrier cyclicBarrier;
    String name;

    MyNewThread(CyclicBarrier c, String n) {
        cyclicBarrier = c;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println(name);

        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e);
        }
    }
}

class BarAction implements Runnable {
    public void run() {
        System.out.println("FINISH");
    }
}
