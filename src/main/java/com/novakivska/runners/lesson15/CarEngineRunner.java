package com.novakivska.runners.lesson15;

import com.novakivska.app.classwork.lesson15.*;

/**
 * Created by Tas_ka on 5/5/2017.
 */
public class CarEngineRunner {

    public static void main(String[] args){
        String engineName = "V8Turbo";
        Engine engine = new Engine(engineName);
        Car15 car = new Car15(engine);
        System.out.println(car.getEngine().getName());
        Navigation navigationGoogle = new Navigation();
        navigationGoogle.setName("Google");
        car.setNavigation(navigationGoogle);
        Navigation navigationGarmin = new Navigation();
        navigationGarmin.setName("Garmin");
        car.setNavigation(navigationGarmin);

        String gearBoxName = "Manual";
        GearBox gearBox = new GearBox(gearBoxName);
        Car15 car1 = new Car15(gearBox);
        System.out.println(car1.getGearBox().getName());
        ChildSeat babySeat = new ChildSeat();
        babySeat.setName("Jakas fignya");
        car.setBabySeat(babySeat);
    }

}
