package com.novakivska.runners.homework12;

import com.novakivska.app.homework.homework12.BicycleWithRing;
import com.novakivska.app.homework.homework12.BicycleWithRingInterface;
import com.novakivska.app.homework.homework12.BicycleHomework12;
import com.novakivska.app.homework.homework12.CustomBicycle;

/**
 * Created by Tas_ka on 4/30/2017.
 */
public class BicycleHomework12Runner {

    public static void main(String[] args){

        BicycleHomework12 bicycleHomework12 = new BicycleHomework12(150, 8);
        BicycleHomework12 customBicycle = new CustomBicycle(120, 2);
        BicycleHomework12 bicycleWithRing = new BicycleWithRing(180, 4, true);
        BicycleWithRingInterface bicycleWithRing1 = new BicycleWithRing(180, 4, true);
        BicycleHomework12 customBicycle1 = new CustomBicycle(10);

        System.out.println("Default bicycle has: " + "speed=" + bicycleHomework12.getSpeed() + " and gear=" +
                            bicycleHomework12.getGear());
        bicycleHomework12.bicycleWroom();

        customBicycle.customBycicleInfo();

        System.out.println("Bycicle with ring has: " + "speed=" + bicycleWithRing.getSpeed() + ", gear=" +
                bicycleWithRing.getGear() + " and ring=" + bicycleWithRing.ring);
        bicycleWithRing.run();
        bicycleWithRing1.run();
        System.out.println("New custom bicycle has gear: " + customBicycle1.getGear());
        customBicycle1.ride();
    }
}
