package com.novakivska.runners.lesson6;

import com.novakivska.app.classwork.lesson6.ForLoop;

/**
 * Created by Tas_ka on 3/24/2017.
 */
public class ForLoopRunner {

    public static void main (String[] args){
        //ForLoop.decade();
        int j = 0;
        for (int i = 0; i <= 10; i++) {
            if ((i%2)==0 || i != 0){
                j++;
            }
        }
        System.out.println("парных чисел " + j);
    }
}
