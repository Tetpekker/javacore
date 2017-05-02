package com.novakivska.app.classwork.lesson13;

/**
 * Created by Tas_ka on 4/28/2017.
 */
public class Car {
    private String name = "Car";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shiftCatGear(){
        System.out.println(name);
    }
}
