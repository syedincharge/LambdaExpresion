package com.rizvi.functionalprograming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p2 = ConvertToMethodReferenceExample::greaterThanTenYearsOfExperience;

        Instructors.getAll().forEach(instructor -> {
            if (p2.test(instructor)){
                System.out.println(instructor);
            }
        });
    }
    private static boolean greaterThanTenYearsOfExperience(Instructor instructor) {
        if (instructor.getYearsOfExperience() > 10)
        return true;
     return false;
    }
}
