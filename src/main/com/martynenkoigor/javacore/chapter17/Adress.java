package com.martynenkoigor.javacore.chapter17;

import java.util.LinkedList;

public class Adress {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    Adress(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}
class MailList {
    public static void main(String[] args) {
        LinkedList<Adress> ml = new LinkedList<Adress>();

        ml.add(new Adress("J.W. West", "11 Oak Ave", "Urbana", "IL", "б1801"));
        ml.add(new Adress("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Adress("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        for (Adress element: ml) {
            System.out.println(element + "\n");
        }

        System.out.println();
    }
}