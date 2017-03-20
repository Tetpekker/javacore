package com.novakivska.app.homework.homework4;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/19/2017.
 */
public class Numbers {

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public static String responseMessage(boolean result){
        String message;
        if (result == true){
            message = "This number is even";
        }else{
            message = "This number is odd";
        }
        return message;
    }

    public static boolean isOdd(int a){
        if ((a % 2) == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int a = getUserInput();

        System.out.println(responseMessage(isOdd(a)));
    }
}
