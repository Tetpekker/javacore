package com.novakivska.app.homework.homework12;

/**
 * Created by Tas_ka on 4/30/2017.
 */
public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {


    public BicycleWithRing(int speed, int gear, boolean ring){
        super(speed, gear);
        setRing(true);
    }

    public void run(){
        System.out.println("Di-ling!");
    }
    }

