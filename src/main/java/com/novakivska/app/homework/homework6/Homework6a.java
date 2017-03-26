package com.novakivska.app.homework.homework6;


import java.util.Random;

/**
 * Created by Tas_ka on 3/26/2017.
 */
public class Homework6a {

    public static int arrayLen(int from, int to, boolean odd){
        int length = 0;

        for (int i = from; i <= to; i++){
            if(odd == false && (i%2) == 0 && i != 0){
                length++;
            }else if(odd == true && (i%2) != 0 && i != 0){
                length++;
            }
        }
        return length;
    }

    public static int[] arrayNum(int from, int to, int length, boolean odd){
        int len = length;
        int [] arrayNum = new int[len];
        int position = 0;
        for (int i = from; i <= to; i++){
            if(odd == false && (i%2) == 0 && i != 0){
                arrayNum[position] = i;
                position++;
            }else if(odd == true && (i%2) != 0 && i != 0){
                arrayNum[position] = i;
                position++;
            }
        }

        return arrayNum;
    }

    public static void printInLine(int[] result) {
        String line = "";
        for (int num: result) {
            line = line + num + " ";
        }
        System.out.println(line);
    }

    public static void printInColon(int[] result) {
        for (int num: result) {
            System.out.println(num);
        }

    }

    public static void printMultiArr(int[] [] arr){
        for (int i = 0; i < arr.length; i++){
            printInLine(arr[i]);
        }
    }

    public static void printDescending(int[] result) {
        String line = "";
        int len = result.length;
        for (int i = 0; i < result.length; i++){
            line = line + result[(len - i - 1)] + " ";
        }
        System.out.println(line);
    }

   public static int[] arrayRandomA (int length, int from, int to){
        int [] result = new int [length];
        for (int i = 1; i <= length; i++){
            result[(i-1)] = randomize(from, to);
       }
        return result;
    }


    public static int randomize(int min, int max){

       Random rd = new Random();
       int rand = rd.nextInt(max - min + 1) + min;
       return rand;
    }


    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }


    public static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int [] [] multiArr(int columns, int rows, int from, int to){
        int [][] multiArr = new int[columns][rows];
        for(int i = 0; i < columns; i++){
            multiArr[i] = arrayRandomA(rows, from, to);
            //printInLine(multiArr[i]);
        }
        return multiArr;
    }
}