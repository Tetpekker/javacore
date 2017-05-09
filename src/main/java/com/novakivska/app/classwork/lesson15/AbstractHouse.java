package com.novakivska.app.classwork.lesson15;

/**
 * Created by Tas_ka on 5/5/2017.
 */
public abstract class AbstractHouse {

   private String name;
   private int floorsNumbers;

   public AbstractHouse(String name){
       this.name = name;
   }
   public AbstractHouse(int floorsNumber){
       this.floorsNumbers = floorsNumber;
   }
    public abstract void build();

    public void showHouseNumber(String number){
        System.out.println("Number: " + number);
    }
    public void showHouseFloorsNumber(int floorsNumbers){
        System.out.println(floorsNumbers + " floors");
    }
}
