package com.rizvi.functionalprograming;

import java.util.List;

public interface InstructorFactory {
    public abstract Instructor getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onLineCourse, List<String> courses);
}
