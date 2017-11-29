package com.ecvlearning.java.oop5;

public class MainStudent {
    public static void main(String[] args) {
        Student jim = new Student("Jim", false);
        jim.setGpa(3.0);

        String[] courses = {"English", "Chinese"};

        for (String course : courses)
            jim.addCourse(course);

        jim.addCourse("Janapase");

        courses[0] = "French";


        for (String course : jim.courses)
            System.out.println(course);


        System.out.println(jim.name);
        System.out.println(jim.isMale);
        System.out.println(jim.gpa);

    }
}
