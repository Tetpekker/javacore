package com.novakivska.app.homework.homework15;

/**
 * Created by Tas_ka on 5/9/2017.
 */
public class Flat {

    private Furniture furniture;
    private TVset tvSet;

    public Flat(Furniture furniture){
        this.furniture = furniture;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public TVset getTvSet() {
        return tvSet;
    }

    public void setTvSet(TVset tvSet) {
        this.tvSet = tvSet;
    }

}
