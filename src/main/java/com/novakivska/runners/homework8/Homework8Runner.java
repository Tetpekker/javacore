package com.novakivska.runners.homework8;

import com.novakivska.app.homework.homework8.Homework8;

/**
 * Created by Tas_ka on 4/1/2017.
 */
public class Homework8Runner {
    public static Homework8 homework8Runner = new Homework8();
    public static void main (String [] args){


        for(int i =0; i <= 2; i++) {
            int [] input = homework8Runner.generateArray(256);
            System.out.println("random generated:::");
            homework8Runner.printArray(input);
            int [] sortedAsc = homework8Runner.bubbleSort(input, true);
            System.out.println("sorted ascending:::");
            homework8Runner.printArray(sortedAsc);
            int [] sortedDesc = homework8Runner.bubbleSort(input, false);
            System.out.println("sorted descending:::");
            homework8Runner.printArray(sortedDesc);
        }
    }
}
