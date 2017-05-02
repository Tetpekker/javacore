package com.novakivska.runners.lesson11;

import com.novakivska.app.classwork.lesson11.Bicycle;

/**
 * Created by Tas_ka on 4/21/2017.
 */
public class BicycleRunner {
    public static void main(String[] args){
        String color = "red";
        String wheelSize = "10";
        int speed = 100500;
        double price = 100500.500;

        Bicycle bicycle = new Bicycle(color);
        Bicycle bicycle2 = new Bicycle(color, wheelSize);
        Bicycle bicycle4 = new Bicycle(color, wheelSize, speed, price);
        //System.out.println(bicycle.color);
        //System.out.println("Bicycle2: " + bicycle2.color + " " + bicycle2.wheelSize);
        System.out.println("The final edition of bicycle has: ");
        System.out.println("color: " + bicycle4.color + ",");
        System.out.println("wheels: " + bicycle4.wheelSize + ", speed: " + bicycle4.speed + ".");
        System.out.println("And finaly price: " + bicycle4.price + "!");
    }
}
