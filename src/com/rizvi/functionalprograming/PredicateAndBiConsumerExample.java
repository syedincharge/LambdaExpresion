package com.rizvi.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();

        //all instructor who teaches online


        Predicate<Instructor> p1 = (i) -> i.isOnLineCourses() == true;
        //instructor experience is >10


        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience()>10;

        //Biconsumer print name and courses


        BiConsumer<String, List<String>> biConsumer = (name, courses) ->
                System.out.println("Instructor Name is " + name + "  and  courses are " + courses);

        instructorList.forEach(instructor -> {
            if(p1.and(p2).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });


    }
}
