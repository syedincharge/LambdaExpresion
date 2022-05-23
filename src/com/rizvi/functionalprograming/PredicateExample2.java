package com.rizvi.functionalprograming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        // all instructor who teaches onLine
        Predicate<Instructor> p1 = (i) -> i.isOnLineCourses() == true;

        // instructor experience is > 10 years
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


    }
}
