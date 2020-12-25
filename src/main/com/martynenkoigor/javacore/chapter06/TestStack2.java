package com.martynenkoigor.javacore.chapter06;

public class TestStack2 {
    public static void main(String[] args) {
        NewStack mystack1 = new NewStack(5);
        NewStack mystack2 = new NewStack(8);

        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        System.out.println("Cтeк в mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Cтeк в mystack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
