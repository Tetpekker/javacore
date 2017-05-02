package com.novakivska.app.classwork.lesson11;

/**
 * Created by Tas_ka on 4/21/2017.
 */
public class Bicycle {
    public String color;
    public String wheelSize;
    public int speed;
    public double price;

    public Bicycle(){
        color = "silver";
    }
    public Bicycle(String color){
        this.color = color;
    }
    public Bicycle(String color, String wheelSize){
        this.color = color;
        this.wheelSize = wheelSize;
        }
    public Bicycle(String color, String wheelSize, int speed, double price){
        this.color = color;
        this.wheelSize = wheelSize;
        this.speed = speed;
        this.price = price;
    }
}
