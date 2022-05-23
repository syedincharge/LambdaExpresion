package com.rizvi.functionalprograming;

import java.util.List;

public class Instructor {

    String name;
    int yearsOfExperience;
    String title;
    String gender;
    boolean onLineCourses;
    List<String> courses;



    public Instructor(String name, int yearsOfExperience, String title, String gender, boolean onLineCourses, List<String> courses) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.title = title;
        this.gender = gender;
        this.onLineCourses = onLineCourses;
        this.courses = courses;

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isOnLineCourses() {
        return onLineCourses;
    }

    public void setOnLineCourses(boolean onLineCourses) {
        this.onLineCourses = onLineCourses;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", onLineCourses=" + onLineCourses +
                ", courses=" + courses +
                '}';


    }
}
