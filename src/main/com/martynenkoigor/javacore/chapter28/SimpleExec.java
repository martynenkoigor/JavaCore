package com.martynenkoigor.javacore.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExec {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(5);
        CountDownLatch count1 = new CountDownLatch(5);
        CountDownLatch count2 = new CountDownLatch(5);
        CountDownLatch count3 = new CountDownLatch(5);
        ExecutorService service = Executors.newFixedThreadPool(1);

        System.out.println("START");

        service.execute(new MyThread2(count, "A"));
        service.execute(new MyThread2(count1, "B"));
        service.execute(new MyThread2(count2, "C"));
        service.execute(new MyThread2(count3, "D"));

        try {
            count.await();
            count1.await();
            count2.await();
            count3.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        service.shutdown();
        System.out.println("FINISH");
    }
}

class MyThread2 implements Runnable {
    String name;
    CountDownLatch countDownLatch;

    MyThread2(CountDownLatch c, String n) {
        countDownLatch = c;
        name = n;

        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ":" + i);
            countDownLatch.countDown();
        }
    }
}
