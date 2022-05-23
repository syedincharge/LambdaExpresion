package com.rizvi.functionalprograming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("Square root of 64: " + sqrt.apply(64));
        System.out.println("Square root of 81: " + sqrt.apply(81));
        System.out.println("Square root of 144: " + sqrt.apply(144));
        System.out.println("Square root of 4096: " + sqrt.apply(4096));

        Function<String,String> lowercaseFunction = s -> s.toLowerCase();
        System.out.println(lowercaseFunction.apply("PROGRAMMING"));
        Function<String, String> concatFunction = (s) -> s.concat(" is easy in Java");

        System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMMING"));





    }
}
