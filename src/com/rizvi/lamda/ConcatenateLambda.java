package com.rizvi.lamda;

public class ConcatenateLambda {

    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (a,b) -> a +" "+b;
        System.out.println(concatenateInterface.sConcat("Hello", "Lambda"));
    }
}
