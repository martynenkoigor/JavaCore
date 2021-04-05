package com.martynenkoigor.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        System.out.println("Зaпycк потока исполнения");
        new MyThread(countDownLatch);
        try {
            countDownLatch.await();
        }catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("FINISH");
    }
}

class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch c) {
        latch = c;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}
