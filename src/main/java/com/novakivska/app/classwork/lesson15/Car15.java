package com.novakivska.app.classwork.lesson15;

/**
 * Created by Tas_ka on 5/5/2017.
 */
public class Car15 {

    private Engine engine;
    private GearBox gearBox;

    private Navigation navigation;
    private ChildSeat babySeat;

   public Car15(Engine engine){
       this.engine = engine;
   }
    public Car15(GearBox gearBox){
        this.gearBox = gearBox;
    }


    public Engine getEngine(){
       return engine;
   }

    public GearBox getGearBox() {
        return gearBox;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public ChildSeat getBabySeat() {
        return babySeat;
    }

    public void setBabySeat(ChildSeat babySeat) {
        this.babySeat = babySeat;
    }
}
