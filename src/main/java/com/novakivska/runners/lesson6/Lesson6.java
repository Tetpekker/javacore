package com.novakivska.runners.lesson6;

/**
 * Created by Tas_ka on 3/24/2017.
 */
public class Lesson6 {
    public static void main(String[] args) {
        int[] arrayInt = new int[2];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        System.out.println(arrayInt);
        for (int arrayPosition : arrayInt) {
            System.out.println(arrayPosition);
        }
        array();
    }

    public static void array() {
        String[] arrayString = {"Bob", "Hanna", "Elena"};
        String[] arrayStringNew = new String[3];
        arrayStringNew[0] = "Hanna";
        arrayStringNew[1] = "John";
        arrayStringNew[2] = "Robert";
        for (String arrayPosition : arrayStringNew) {
            System.out.println(arrayPosition);
        }
    }
}
