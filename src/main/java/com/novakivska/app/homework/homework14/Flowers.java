package com.novakivska.app.homework.homework14;

/**
 * Created by Tas_ka on 5/9/2017.
 */
public class Flowers {

    private String name;
    private int price;

    public Flowers(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void flowerItem(){
        System.out.println("Flower " + getName() + ": " + getPrice() + " dollars.");
    }
}
