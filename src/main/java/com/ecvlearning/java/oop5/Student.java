package com.ecvlearning.java.oop5;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public Student(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
        courses = new ArrayList<>();
    }

    boolean isMale;
    String school;
    double gpa;
    String name;
    List<String> courses;

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean addCourse(String name) {
        courses.add(name);
        return true;
    }
}
