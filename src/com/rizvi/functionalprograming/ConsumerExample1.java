package com.rizvi.functionalprograming;

import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.length() +"  the value of X :  "+x);
        c.accept("Up in the air ");

        // Consumer with Block statement
        Consumer<Integer> d = (x) -> {
            System.out.println("X*X = " + x*x);
            System.out.println("x/x = " + x/x);
        };
        d.accept(12);
    }
}
