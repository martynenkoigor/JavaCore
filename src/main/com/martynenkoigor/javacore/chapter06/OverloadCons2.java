package com.martynenkoigor.javacore.chapter06;

import com.martynenkoigor.javacore.chapter05.Box;



public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);

        vol = mybox3.volume();
        System.out.println("Oбъeм куба равен " + vol);

        vol = myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);
    }
}
