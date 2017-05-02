package com.novakivska.app.classwork.lesson12;

/**
 * Created by Tas_ka on 4/25/2017.
 */
public class Student extends Person{

    public Student(String name, String university, int age) {
        super(name, university, age);
    }

    public void printStudentInfo(){
        System.out.println("Student's info: " + getName() + ", " + getUniversity() + ", age: " + getAge());
    }

    public void stayInUniversity(){
        System.out.println(super.getStay());
    }
}
