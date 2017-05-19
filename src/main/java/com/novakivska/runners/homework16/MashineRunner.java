package com.novakivska.runners.homework16;

import com.novakivska.app.homework.homework16.Caterpillar;
import com.novakivska.app.homework.homework16.Tractor;
import com.novakivska.app.homework.homework16.Wheeled;

/**
 * Created by Tas_ka on 5/18/2017.
 */
public class MashineRunner {
    public static void main(String[] args){

       Tractor wheeled = new Wheeled("Wheeled Tractor", 100, "3 tonnas", 2, 4);
       Tractor caterpillar = new Caterpillar("CAT", 70, "5 tonnas", 2, 8);
        wheeled.mashineInfo();
        caterpillar.mashineInfo();
    }
}
