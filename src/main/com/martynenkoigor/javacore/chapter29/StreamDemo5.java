package com.martynenkoigor.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();


        myList.add("Alpha");
        myList.add("Betta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Ksi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitItr = myStream.spliterator();

        while (splitItr.tryAdvance((n) -> System.out.println(n)));
    }
}
