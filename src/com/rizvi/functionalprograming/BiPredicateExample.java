package com.rizvi.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();
        BiPredicate<Boolean, Integer> p3 = (online, experience) -> online == true && experience > 10;

        //Biconsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) ->
                System.out.println("Instructor Name is  " + name + " and courses  " + courses);

        instructorList.forEach(instructor -> {
            if(p3.test(instructor.isOnLineCourses(), instructor.getYearsOfExperience()))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });
    }

}
