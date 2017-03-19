package com.novakivska.runners.lesson4;

import com.novakivska.app.classwork.lesson4.Car;

/**
 * Created by Tas_ka on 3/17/2017.
 */
public class CarRunner {
    public static void main(String[] args){
        Car lexus = new Car();
        lexus.name = "h300";
        Car toyota = new Car();
        toyota.name = "corolla";
        System.out.println(lexus.name + " " + Car.wheelCounter);
        System.out.println(toyota.name + " " + Car.wheelCounter);
        Car.driver();
        System.out.println(lexus.name + " " + Car.doors);
        System.out.println(toyota.name + " " + Car.doors);
        System.out.println(lexus.name + " " + Car.jet);
        System.out.println(toyota.name + " " + Car.jet);
        System.out.println("The wheels of " + lexus.name + " should be " + Car.WheelShape);
        System.out.println("The wheels of " + toyota.name + " should be " + Car.WheelShape + " as well");
    }
}
