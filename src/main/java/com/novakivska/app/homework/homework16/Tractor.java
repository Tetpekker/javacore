package com.novakivska.app.homework.homework16;

/**
 * Created by Tas_ka on 5/18/2017.
 */
public class Tractor extends Mashine {

    private String weight;
    private int passengers;
    private int wheels;

    public Tractor(String transportName, int speedNow){
        super(transportName, speedNow);
    }
    public Tractor(String transportname, int speedNow, String weight, int passengers, int wheels){
        super(transportname, speedNow);
        this.weight = weight;
        this.passengers = passengers;
        this.wheels = wheels;

    }

    @Override
    public void printName() {

    }

    @Override
    public int getSpeed() {

        return 0;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    @Override
    public int getPassengers() {

        return 0;
    }

    @Override
    public void wheels() {

    }
}
