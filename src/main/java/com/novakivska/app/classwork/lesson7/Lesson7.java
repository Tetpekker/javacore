package com.novakivska.app.classwork.lesson7;

import java.util.Arrays;

/**
 * Created by Tas_ka on 3/31/2017.
 */
public class Lesson7 {
    public static void main(String [] args){
        int [] intArray = {1,2,3};
        for(int i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

        int[] intArray2 = {1,2,3};
        System.out.println(Arrays.toString(intArray2));

        int[][] intArray3 = new int[2][3];
        for(int j=0; j<intArray3.length; j++){
            for (int k=0; k<intArray3[j].length; k++){
                intArray3[j][k] = j*k;
            }
        }
        conditon();
    }
    public static void conditon(){
        int ab = 8;
        int cd = 7;
        if (ab > cd) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}