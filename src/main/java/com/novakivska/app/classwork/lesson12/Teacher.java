package com.novakivska.app.classwork.lesson12;

/**
 * Created by Tas_ka on 4/25/2017.
 */
public class Teacher extends Person{

    private String faculty;
    private int experience;
    private String degree;

    public Teacher (String name, int age, String university, String faculty, int experience, String degree){
        super(name, university,age);
        this.faculty = faculty;
        this.experience = experience;
        this.degree = degree;
    }

    public void printTeacherInfo(){
        System.out.println("Teacher's info: " + getName() + ", " + getAge() + ", " + getUniversity() + ", " +
                            faculty + ", " + experience + ", " + degree);
    }

        public void stayInUniversity(){
        System.out.println(super.getStay());
        this.getStay();
    }
}
