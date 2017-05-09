package com.novakivska.app.classwork.lesson15;

/**
 * Created by Tas_ka on 5/5/2017.
 */
public class NewYork extends AbstractHouse {

    public NewYork(int floorsNumber) {
        super(floorsNumber);
    }

    public void build() {
        System.out.println("NewYork House should be built");
        showHouseFloorsNumber(30);

    }
}
