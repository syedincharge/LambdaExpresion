package com.rizvi.functionalprograming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //  if number is greater than 10 return true otherwise false

        System.out.println("########---if number is greater than 10 return true otherwise false --- Which is  100");
        Predicate<Integer> p1 = (i) ->  i > 10;
        System.out.println(p1.test(100));


        // if i > 10  && number is even number (i%2 == 0)
        System.out.println("#######----i > 10  && number is even number (i%2 == 0)----- which is  20");
        Predicate<Integer> p2 = (i) -> i%2 == 0;
        System.out.println(p1.and(p2).test(20));

        // i > 10  ||  number is even number (i%2 == 0)
        System.out.println("########----i > 10  ||  number is even number (i%2 == 0) ----- which is  4");

        System.out.println(p1.or(p2).test(4));

       //  i > 0  &&  i%2 != 0
        System.out.println("########----i > 0  &&  i%2 != 0  ------  which is  33" );

        System.out.println(p1.and(p2.negate()).test(33));


    }
}
