package com.novakivska.runners.lesson17;

import com.novakivska.app.classwork.lesson17.Holidays;

/**
 * Created by Tas_ka on 5/16/2017.
 */
public class HolidaysRunner {
    public static void main(String[] args){
        for(Holidays cName: Holidays.values()){
            System.out.println("We selebrate " + cName + " " + cName.getDate() + " of " + cName.getMonth() + " With " +
                                cName.getDescript());
        }
    }
}
