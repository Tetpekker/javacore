package com.novakivska.runners.homework6;

import com.novakivska.app.homework.homework6.Homework6;

/**
 * Created by Tas_ka on 3/26/2017.
 */
public class Homework6Runner {

    public static void main (String[] args){
        int from = 2;
        int to = 20;
        boolean odd = false;
        int length = Homework6.arrayLen(from, to, odd);
        int [] result = Homework6.arrayNum(from, to, length, odd);
        Homework6.printInLine(result);
        Homework6.printInColon(result);

        int fromB = 1;
        int toB = 99;
        boolean oddB = true;
        int lengthB = Homework6.arrayLen(fromB, toB, oddB);
        int [] resultB = Homework6.arrayNum(fromB, toB, lengthB, oddB);

        Homework6.printInLine(resultB);
        Homework6.printDescending(resultB);

        Homework6.printInLine(Homework6.arrayRandomA(15, 0, 9));

        int [] arr = Homework6.arrayRandomA(15, 0, 999);
        Homework6.printInLine(arr);
        System.out.println("min is : " + Homework6.getMinValue(arr) + " max is: " + Homework6.getMaxValue(arr));

        int[][] arr5 = Homework6.multiArr(5, 8, 10, 99);
        Homework6.printMultiArr(arr5);
    }
}
