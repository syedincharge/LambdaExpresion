package com.rizvi.javaimprovements;



import com.rizvi.functionalprograming.Instructor;
import com.rizvi.functionalprograming.Instructors;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class VarWithLambdaExample {
    public static void main(String[] args) {

        var instructors = Instructors.getAll();
        Predicate<Instructor> experiencePredicate = (var s) ->
                s.getYearsOfExperience() > 10;
        instructors.forEach(instructor -> {
            if(experiencePredicate.test(instructor)){
                var result = instructor.getName();
                System.out.println("result = " + result);
            }
        });

        BiFunction<Integer,Integer,Integer> sum = (var x, var y) -> x + y;
        System.out.println("sum.apply(2,4) = " + sum.apply(2,4));

        
    }

}
