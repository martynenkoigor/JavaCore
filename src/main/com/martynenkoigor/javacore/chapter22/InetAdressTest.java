package com.martynenkoigor.javacore.chapter22;

import com.martynenkoigor.javacore.chapter07.A;

import java.net.*;

public class InetAdressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Adress = InetAddress.getLocalHost();
        System.out.println(Adress);

        Adress = InetAddress.getByName("www.HerbShildt.com");
        System.out.println(Adress);

        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < SW.length; i++)
            System.out.println(SW[i]);
    }
}
