package com.rizvi.streams;

import com.rizvi.functionalprograming.Instructor;
import com.rizvi.functionalprograming.Instructors;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //total years of experience b/w instructors
        int result = Instructors.getAll().stream()
                .filter(Instructor::isOnLineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0,Integer::sum);

        System.out.println(result);


    }
}
