package com.javalec.studentManager;

import java.util.ArrayList;

public class StudentExpel {

    ArrayList<Student> expelStudents;

    public StudentExpel() {
        expelStudents = new ArrayList<Student>();
    }

    public void addExpelStudents(String name, int age, int studentNum, String major) {
        expelStudents.add(new Student(name, age, studentNum, major));
    }
}
