package com.novakivska.app.classwork.lesson18;

/**
 * Created by Tas_ka on 5/23/2017.
 */
public class Browser {
    private String name;
    private int version;

    public void invoke(String name){
        System.out.println(name);
    }

    public void invoke(String name, int version){
        System.out.println(name + " " + version);
    }
}
