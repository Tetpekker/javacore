package com.novakivska.runners.lesson16;

import com.novakivska.app.classwork.lesson16.ACMEBicycle;
import com.novakivska.app.classwork.lesson16.Bicycle;
import com.novakivska.app.classwork.lesson16.Maintenance;
import com.novakivska.app.classwork.lesson16.PartsStandard;

/**
 * Created by Tas_ka on 5/12/2017.
 */
public class BicycleRunner {
    
    public static void main(String[] args){

        Bicycle bicycle = new ACMEBicycle();
        bicycle.changeGear(10);
        bicycle.showSpeed();

        PartsStandard standard = new ACMEBicycle();
        standard.useEcoItems();

        Maintenance maintenance = new ACMEBicycle();
        maintenance.clean();
        
        ACMEBicycle acmeBicycle = new ACMEBicycle();
        acmeBicycle.printStates();
        acmeBicycle.useEcoItems();
        System.out.println(acmeBicycle);
    }
}
