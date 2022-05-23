package com.rizvi.functionalprograming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        //printng two numbers
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("a :  "+a + "   b : "+b);
        biConsumer.accept(2,4);
        //printng sum of two integers
        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> System.out.println("a+b  :  "+(a+b));
        biConsumer1.accept(2, 4);
        //concatenate Strings
        BiConsumer<String, String> biConsumer2 = (a, b) -> System.out.println(a+b);
        biConsumer2.accept("Fell  on ", " deaf  Ears");
    }
}
