package com.novakivska.app.classwork.lesson13.Polymorphism;

/**
 * Created by Tas_ka on 4/28/2017.
 */
public class IBM extends Computer {

    public void changeRAM(){
        System.out.println("Changing IBM RAM memory");
    }
    public void changeTOSSD(){
        System.out.println("Changing IBM SSD");
    }
    public void changeCPU(){
        System.out.println("Changing IBM CPU");
    }
}
