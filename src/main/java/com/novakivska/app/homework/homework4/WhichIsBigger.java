package com.novakivska.app.homework.homework4;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/19/2017.
 */
public class WhichIsBigger {


    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public static String responseMessage(boolean result){
        String message;
        if (result == true){
            message = "The 1st number is bigger";
        }else{
            message = "The 2nd number is bigger";
        }
        return message;
    }

    public static boolean wichBigger(int a, int b){
        if (a >= b){
            return true;
        }else{
            return false;
        }
    }

    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int a = getUserInput();
        System.out.println("Please enter the 2nd number");
        int b = getUserInput();

        System.out.println(responseMessage(wichBigger(a, b)));
    }
}
