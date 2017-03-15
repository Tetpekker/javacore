package com.novakivska.runners;

import com.novakivska.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by Tas_ka on 3/13/2017.
 */
public class Lesson3Runner {

    public static void main(String[] args) {

        float fl = (float) 5.5;
        int i = 7;
        char ch = 't';

        PrimitiveConvertor pc = new PrimitiveConvertor();
        pc.intToChar(i);
        pc.charToInt(ch);
        pc.floatToChar(fl);
    }
}
