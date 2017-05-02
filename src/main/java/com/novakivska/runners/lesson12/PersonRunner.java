package com.novakivska.runners.lesson12;

import com.novakivska.app.classwork.lesson12.Person;
import com.novakivska.app.classwork.lesson12.Student;
import com.novakivska.app.classwork.lesson12.Teacher;

/**
 * Created by Tas_ka on 4/25/2017.
 */
public class PersonRunner {

    public static void main(String[] args){

        String name = "Tas_ka";
        String university = "NPU";
        int age = 43;
        String faculty = "FL";
        int experience = 100500;
        String degree = "proffesor";
        int stay = 5;
        Student student = new Student(name, university, age);
        //student.age = 17;
        //student.stay =6;
        student.setAge(17);
        student.setStay(6);
        student.printStudentInfo();
        System.out.println(student.getName());
        student.stayInUniversity();


       // Person person = new Person(name);
        //System.out.println(person.name);


        Teacher prepod = new Teacher(name, age, university, faculty, experience, degree);
        prepod.setName("Vitya Fiodorovich");
        prepod.setAge(88);
        prepod.setStay(10);
        prepod.printTeacherInfo();

        prepod.stayInUniversity();

    }
}
