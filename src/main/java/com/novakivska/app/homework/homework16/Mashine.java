package com.novakivska.app.homework.homework16;

/**
 * Created by Tas_ka on 5/18/2017.
 */
public abstract class Mashine implements Run{

    int minSpeed = 100;
    int maxSpeed = 500;
    int minPassengers = 1;
    int maxPassengers = 40;

    String transportName;
    int nowSpeed;

    public Mashine(String transportName, int nowSpeed){
        this.transportName = transportName;
        this. nowSpeed = nowSpeed;
    }


    public void mashineInfo(){
        System.out.println("This mashine is: " + transportName + " with speed: " + nowSpeed + ".");
    }
}
