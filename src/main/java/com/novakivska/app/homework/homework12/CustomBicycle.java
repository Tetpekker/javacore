package com.novakivska.app.homework.homework12;

/**
 * Created by Tas_ka on 4/30/2017.
 */
public class CustomBicycle extends BicycleHomework12 {

    public CustomBicycle(int speed, int gear){
        super(speed, gear);
    }
    public CustomBicycle(int gear){
        super(gear);
    }
    public void ride(){
        System.out.println("Wshhhh!");
    };

    public void customBycicleInfo(){
        System.out.println("Custom bycicle has: speed=" + getSpeed() + " and gear=" + getGear());
    }

}
