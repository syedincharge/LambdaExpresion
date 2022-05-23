package com.rizvi.functionalprograming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = instructor -> instructor.isOnLineCourses();
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

        System.out.println("---------- Instructor who teaches onLine  ------------");

        List<Instructor> instructorList = Instructors.getAll();
        instructorList.forEach(instructor -> {
            if(p1.test(instructor)){
                System.out.println(instructor);
            }
        });
        System.out.println("----------- Instructor experience is > 10 years  -----------");
        // is instructor teaches onLine and experience is > 10 years

        instructorList.forEach(instructor -> {
            if(p1.and(p2).test(instructor)){
                System.out.println(instructor);
            }
        });



        Function<Integer, Double> sqrt  = a -> Math.sqrt(a);
        Function<Integer, Double> sqrt1 = Math::sqrt;




        Function<String, String> lowercaseFunction = s -> s.toLowerCase();
        Function<String, String> lowercaseFunction1 = String::toLowerCase;


    }

}
