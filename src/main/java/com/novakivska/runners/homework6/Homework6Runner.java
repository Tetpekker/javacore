package com.novakivska.runners.homework6;

import com.novakivska.app.homework.homework6.Homework6a;

/**
 * Created by Tas_ka on 3/26/2017.
 */
public class Homework6Runner {

    public static void main (String[] args){
        int from = 2;
        int to = 20;
        boolean odd = false;
        int length = Homework6a.arrayLen(from, to, odd);
        int [] result = Homework6a.arrayNum(from, to, length, odd);
        Homework6a.printInLine(result);
        Homework6a.printInColon(result);

        int fromB = 1;
        int toB = 99;
        boolean oddB = true;
        int lengthB = Homework6a.arrayLen(fromB, toB, oddB);
        int [] resultB = Homework6a.arrayNum(fromB, toB, lengthB, oddB);

        Homework6a.printInLine(resultB);
        Homework6a.printDescending(resultB);

        Homework6a.printInLine(Homework6a.arrayRandomA(15, 0, 9));

        int [] arr = Homework6a.arrayRandomA(15, 0, 999);
        Homework6a.printInLine(arr);
        System.out.println("min is : " + Homework6a.getMinValue(arr) + " max is: " + Homework6a.getMaxValue(arr));

        int[][] arr5 = Homework6a.multiArr(5, 8, 10, 99);
        Homework6a.printMultiArr(arr5);
    }
}
