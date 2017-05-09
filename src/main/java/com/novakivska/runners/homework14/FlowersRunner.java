package com.novakivska.runners.homework14;

import com.novakivska.app.homework.homework14.*;

/**
 * Created by Tas_ka on 5/9/2017.
 */
public class FlowersRunner {
    public static void main(String[] args) {
        //Flowers defaultFlower = new Flowers("Default", 1);
        Flowers roses = new Roses("Roses", 25);
        Flowers dianthuses = new Dianthus("Dianthuses", 15);
        Flowers tulips = new Tulips("Tulips", 20);
        Flowers camomiles = new Camomiles("Camomiles", 10);

        String roseFlowerName = roses.getName();
        int roseFlowerPrice = roses.getPrice();
        int roseFlowerAmount = 5;
        int roseFlowerSubTotal = roseFlowerPrice * roseFlowerAmount;

        String dianthusesFlowerName = dianthuses.getName();
        int dianthusesFlowerPrice = dianthuses.getPrice();
        int dianthusesFlowerAmount = 3;
        int dianthusesFlowerSubtotal = dianthusesFlowerPrice * dianthusesFlowerAmount;

        String tulipFlowerName = tulips.getName();
        int tulipFlowerPrice = tulips.getPrice();
        int tulipFlowerAmount = 7;
        int tulipFlowerSubtotal = tulipFlowerPrice * tulipFlowerAmount;

        String camomileFlowerName = camomiles.getName();
        int camomileFlowerPrice = camomiles.getPrice();
        int camomileFlowerAmount = 7;
        int camomileFlowerSubtotal = camomileFlowerPrice * camomileFlowerAmount;

        int totalFlowers = roseFlowerAmount + dianthusesFlowerAmount + tulipFlowerAmount + camomileFlowerAmount;
        int totalPrice = roseFlowerSubTotal + dianthusesFlowerSubtotal + tulipFlowerSubtotal + camomileFlowerSubtotal;
        System.out.println("Your bunch of flowers contains " + totalFlowers + " items: " +
                        roseFlowerName + "=" + roseFlowerAmount + ", " +
                        dianthusesFlowerName + "=" + dianthusesFlowerAmount + ", " +
                        tulipFlowerName + "=" + tulipFlowerAmount + ", " +
                        camomileFlowerName + "=" + camomileFlowerAmount + ", " +
                        "and costs " + totalPrice + " dollars.");
    }

}



