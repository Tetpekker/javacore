package com.novakivska.app.homework.homework16;

/**
 * Created by Tas_ka on 5/18/2017.
 */
public class Wheeled extends Tractor implements Run {

    public Wheeled(String transportName, int speedName){
        super(transportName, speedName);
    }

    private String name;
    private int speed;
    private int weight;
    private int passengers;
    private int wheels;

    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    public int getWheels() {
        return wheels;
    }

    public void mashineInfo(){
        System.out.println("This mashine is: " + transportName + " with speed: " + nowSpeed + ".");
    }
}
