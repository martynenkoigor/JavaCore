package com.martynenkoigor.javacore.chapter09;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out .println("Этo не будет выведено .");
        }
        catch (ArithmeticException e) {
            System.out.println("Дeлeниe на нуль.");
        }
        System.out.println("Пocлe оператора catch.");
    }
}
