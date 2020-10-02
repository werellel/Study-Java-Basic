package com.javalec.studentManager;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<Student>();
    StudentExpel studentExpel = new StudentExpel();

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent("홍길동1", 22, 20121111, "국문과");
        studentManager.addStudent("홍길동2", 23, 20131111, "영문과");
        studentManager.addStudent("홍길동3", 24, 20141111, "독문과");
        studentManager.addStudent("홍길동4", 25, 20151111, "중문과");

        System.out.println(studentManager.students.get(0).getName());
        System.out.println(studentManager.students.get(0).getAge());
        System.out.println(studentManager.students.get(0).getStudentNum());
        System.out.println(studentManager.students.get(0).getMajor());

    }

    public void addStudent(String name, int age, int studentNum, String major) {
        students.add(new Student(name, age, studentNum, major));
        System.out.println(name + " 학생 정보 입력 성공!!");
    }
}
