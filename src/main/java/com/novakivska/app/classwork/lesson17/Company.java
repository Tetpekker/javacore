package com.novakivska.app.classwork.lesson17;

/**
 * Created by Tas_ka on 5/16/2017.
 */
public enum Company {

    EBAY(10, "Bla-bla-bla"), GOOGLE(15, "Blah-blah-blah");

    private int age;
   private String name;

    Company(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
