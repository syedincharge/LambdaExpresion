package com.rizvi.functionalprograming;


import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerExample2 {

    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();
         // Traditinal way
        System.out.println(instructorList.stream().map(Instructor::getCourses).collect(Collectors.toList()));

        System.out.println("###################################################################################################################################################################################");
   // looping through all the instructors and printing out the values of instructors

        Consumer<Instructor> c1 = (s1 ) -> System.out.println(s1);
        instructorList.forEach(c1);
        System.out.println("###################################################################################################################################################################################");


        // looping through all the instructors and only printing out their name

        Consumer<Instructor> c2 = (s1 ) -> System.out.println(s1.getName().toUpperCase());
        instructorList.forEach(c2);
        System.out.println("###################################################################################################################################################################################");

        // looping through all the instructors and printing out their name and courses

        Consumer<Instructor> c3 = (s1 ) -> System.out.println(s1.getCourses());
        instructorList.forEach(c2.andThen(c3));
        System.out.println("###################################################################################################################################################################################");


        // looping through all the instructors and printing out their name if their yearOfExperience is greater the 5 years

       instructorList.forEach( s1 -> {
       if(s1.yearsOfExperience > 10) {
           c1.accept(s1);
           }
       });
        System.out.println("###################################################################################################################################################################################");
        // looping through all the instructors and printing out their name if their yearOfExperience is greater the 5 years and teaches courseOnline
         instructorList.forEach(s1 -> {
           if(s1.yearsOfExperience > 5 && !s1.isOnLineCourses()){
              c1.andThen(c2).accept(s1);
           }
         } );
        System.out.println("###################################################################################################################################################################################");

    }
}
