package com.novakivska.runners.lesson13;

import com.novakivska.app.classwork.lesson13.Car;

/**
 * Created by Tas_ka on 4/28/2017.
 */
public class CarRunner {
    public static void main(String[] args){
    Car car = new Car();
//        car.name = "Audi";
//        car.name = "BMW";
        car.setName("BMW");
        System.out.println(car.getName());
    }
}
