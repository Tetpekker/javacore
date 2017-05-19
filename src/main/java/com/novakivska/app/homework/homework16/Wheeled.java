package com.novakivska.app.homework.homework16;

/**
 * Created by Tas_ka on 5/18/2017.
 */
public class Wheeled extends Tractor implements Run {

    public Wheeled(String transportName, int speedNow){
        super(transportName, speedNow);
    }
    public Wheeled(String trasportName, int speedNow, String weight, int passengers, int wheels){
        super(trasportName, speedNow);
        this.weight = weight;
        this.passengers = passengers;
        this.wheels = wheels;
    }

    private String name;
    private int speed;
    private String weight;
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
    public String getWeight() {
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
        System.out.println("This mashine is: " + transportName + " with speed: " + nowSpeed + ", weight: " +
                            weight + ", passengers: " + passengers + " and wheels: " + wheels + ".");
    }
}
