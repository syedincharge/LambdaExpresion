package com.rizvi.functionalprograming;


import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor("Mike", 10, "Software Developer","M", true, Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
        Instructor instructor2 = new Instructor("Jenny", 5, "Engineer","F", false, Arrays.asList("Multi-Threading Programming", "CI/CD", "Unit Testing"));
        Instructor instructor3 = new Instructor("Gene", 6, "Manager","F", false, Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
        Instructor instructor4 = new Instructor("Anthony", 15, "Senior Developer","M", true, Arrays.asList("Java Programming", "Angular  Programming", "React Native"));
        Instructor instructor5 = new Instructor("Syed", 15, "Principal Engineer","F", true, Arrays.asList("Java Programming", "Multi-Threading Programming", "React Programming"));


        List<Instructor> list =  Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);

        return  list;

    }

}
