package com.novakivska.runners.homework15;

import com.novakivska.app.homework.homework15.Flat;
import com.novakivska.app.homework.homework15.Furniture;
import com.novakivska.app.homework.homework15.TVset;

/**
 * Created by Tas_ka on 5/9/2017.
 */
public class HouseRunner {
    public static void main(String[] args) {

        int furnitureItems = 10;
        Furniture furniture = new Furniture(furnitureItems);
        Flat flat = new Flat(furniture);
        System.out.println("My sweet flat contains: ");
        System.out.println(flat.getFurniture().getFurnitureItems() + " items of furniture.");
        TVset tvSony = new TVset();
        tvSony.setName("Sony");
        flat.setTvSet(tvSony);
        System.out.println("Also I've bought a tv-set " + tvSony.getName() + ",");
        TVset tvPanasonic = new TVset();
        tvPanasonic.setName("Panasonic");
        flat.setTvSet(tvPanasonic);
        System.out.println("But recently I've changed it to " + tvPanasonic.getName() + ".");
    }
}
