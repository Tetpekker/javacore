package com.novakivska.app.homework.homework12;

/**
 * Created by Tas_ka on 4/30/2017.
 */
public class BicycleHomework12 {

    private int speed = 100;
    private int gear = 4;
    public boolean ring = false;

    public void ride(){
    };

    public BicycleHomework12(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }
    public BicycleHomework12(int gear){
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    public boolean getRing(){
        return ring;
    }

    public void setRing(boolean ring) {
        this.ring = ring;
    }

    public void bicycleWroom(){
        System.out.println("Wroom!");
    }

    public void customBycicleInfo() {
    }

    public void run() {
    }
}
