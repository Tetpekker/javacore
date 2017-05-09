package com.novakivska.app.classwork.lesson15;

/**
 * Created by Tas_ka on 5/5/2017.
 */
public class Chicago extends AbstractHouse {

    public Chicago(String name) {
        super(name);
    }

    public void build() {
        System.out.println("Build Chicago house");
        showHouseNumber("137");
    }
}
