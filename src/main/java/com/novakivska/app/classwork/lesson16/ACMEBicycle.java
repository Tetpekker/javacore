package com.novakivska.app.classwork.lesson16;

/**
 * Created by Tas_ka on 5/12/2017.
 */
public class ACMEBicycle implements Bicycle, PartsStandard, Maintenance {

    int cadence = 0;
    int gear = 10;
    int speed = 5;

    @Override
    public void changeGear(int newValue) {
        this.gear = newValue;

    }

    @Override
    public void changeCadence(int newValue) {
        this.cadence = newValue;

    }

    public void printStates(){
        System.out.println("Speed is " + speed);
    }

    @Override
    public void useEcoItems() {
        System.out.println("Use eco items!");
    }

    @Override
    public void clean() {
        System.out.println("We will clean you!");
    }

    public String toString(){
        return "ACMEBicycle{"+
                "cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
