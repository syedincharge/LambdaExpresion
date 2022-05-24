package com.rizvi.streams;



import com.rizvi.functionalprograming.Instructor;
import com.rizvi.functionalprograming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        //count the numbers of instructors who teaches online courses
        //stream.count
        long count = Instructors.getAll().stream()
                    .filter(Instructor::isOnLineCourses)
                    .count();
        System.out.println(count);
        
        
        //collectors.counting
        count = Instructors.getAll().stream()
                .filter(Instructor::isOnLineCourses)
                .collect(Collectors.counting());
        System.out.println("count = " + count);
        
    }
}
