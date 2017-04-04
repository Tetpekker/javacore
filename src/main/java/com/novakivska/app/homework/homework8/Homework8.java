package com.novakivska.app.homework.homework8;

import com.novakivska.app.homework.homework6.Homework6a;

import java.util.Random;

/**
 * Created by Tas_ka on 4/1/2017.
 */
public class Homework8 {
    public static Homework6a action = new Homework6a();



    public static int[] generateArray(int num){
        int min = 1;
        int max = 999;
        int [] result = new int[num];


        for (int i = 0; i < result.length; i++){
            result[i] = action.randomize(min, max);
        }
        return result;
    }


    public static int [] bubbleSort(int [] input, boolean isAscending){
        int [] output = input;


        int inputLen = input.length;
        int tempVar = 0;


        for (int i = 0; i < inputLen; i++){
            for (int j = 1; j <= (inputLen - 1); j++){
                if (isAscending == true) {
                    if (output[j - 1] > output[j]) {
                        tempVar = output[j - 1];
                        output[j - 1] = output[j];
                        output[j] = tempVar;
                    }
                }else {
                    if (output[j - 1] < output[j]) {
                        tempVar = output[j - 1];
                        output[j - 1] = output[j];
                        output[j] = tempVar;
                    }
                }
            }
           // printArray(input);
        }


        return output;


    }


    public static void printArray(int [] result){
        String s = "";
        for (int i = 0; i < result.length; i++) {
            s = s + " " + result[i];
        }
        System.out.println(s);
    }


}
