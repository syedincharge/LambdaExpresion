package com.rizvi.streams;



import com.rizvi.functionalprograming.Instructor;
import com.rizvi.functionalprograming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {
    public static void main(String[] args) {
        //count   distinct
        Long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();

        System.out.println(count);
        System.out.println("########################################################");
        //distinct
        List<String> courses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(courses);

        System.out.println("########################################################");

        //anymatch, allmatch and nonmatch


        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
              //  .anyMatch(s -> s.startsWith("J"));
               .noneMatch(s -> s.startsWith("J"));

        System.out.println(match);




    }
}
