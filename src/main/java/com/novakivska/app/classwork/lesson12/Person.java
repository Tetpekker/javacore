package com.novakivska.app.classwork.lesson12;

/**
 * Created by Tas_ka on 4/25/2017.
 */
public class Person {

    private String name;
    private String university;
    private int age;
    private int stay;

    public Person(String name, String university, int age){
        this.name = name;
        this.university = university;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStay() {
        return stay;
    }

    public void setStay(int stay) {
        this.stay = stay;
    }

    public void printPersonInfo(){
        System.out.println("Person;s info: name:" + name);
    }

    public void stayInUniversity(){
        System.out.println(stay);
    }
}
