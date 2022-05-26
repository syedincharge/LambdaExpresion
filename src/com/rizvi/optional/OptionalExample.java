package com.rizvi.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // Integer[] numbers = new Integer[10];
        // int number = numbers[1].intValue();
        // System.out.println("number = " + number);

//        Optional<Integer> checkNullInt = Optional.ofNullable(numbers[1]);
//        int result = checkNullInt.isPresent() ? checkNullInt.get() : -1;
//        System.out.println("Result   = : "+result );
        
        Optional<String> optionalString = Optional.of("Hello World");
        System.out.println("optionalString = " + optionalString);

        System.out.println("getWords:" + getWords());

    }

    public static Optional<String>  getWords() {
        String[] words = new String[10];
        Optional<String> optionalS = Optional.ofNullable(words[1]);
        if (optionalS.isPresent())
            return optionalS;
        else
            return Optional.empty();
    }
}
