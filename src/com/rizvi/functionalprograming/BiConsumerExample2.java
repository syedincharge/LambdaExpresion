package com.rizvi.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {
        // print out name and gender of instructors
        List<Instructor> instructorList = Instructors.getAll();

        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("Name is  : " +name + "    and gender is  : "+gender);
        instructorList.forEach(instructor ->
                biConsumer.accept(instructor.getName(), instructor.getGender()));

        System.out.println("######################################################################################################");
        // print out the name of instructor and courses
       BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out.println( "Name is   : "+ name+  "  and coures are   :  "+ courses);
       instructorList.forEach(instructor -> {
           biConsumer1.accept(instructor.getName(), instructor.getCourses());
       });
        System.out.println("######################################################################################################");

        // print out name and gender of all instructors who teaches onLine
        BiConsumer<String, String> biConsumer3 = (name, gender) -> System.out.println("Name is  : " +name + "    and gender is  : "+gender);
        instructorList.forEach(instructor ->{
            if(instructor.isOnLineCourses())
                biConsumer3.accept(instructor.getName(), instructor.getGender());
                });

    }
}
