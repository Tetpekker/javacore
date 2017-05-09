package com.novakivska.runners.lesson15;

import com.novakivska.app.classwork.lesson15.AbstractHouse;
import com.novakivska.app.classwork.lesson15.NewYork;

/**
 * Created by Tas_ka on 5/5/2017.
 */
public class HouseRunner {

    public static void main(String[] args){
        AbstractHouse newYork = new NewYork(34);
        newYork.build();
    }
}
