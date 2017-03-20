package com.novakivska.app.homework.homework4;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/19/2017.
 */
public class Triangle {

    public static String responseMessage(boolean result){
        String message;
        if (result == true){
            message = "This is a right-angled triangle";
        }else{
            message = "This is not a right-angled triangle";
        }
        return message;

    }

    public static int exponentiation(int a){
        int exponentValue = a * a;
        return exponentValue;
    }

    public static boolean verifyTriangle(int a, int b, int c){
        if (exponentiation(a) == exponentiation(b) + exponentiation(c)){
            return true;
        } else{
            return false;
        }
    }

    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public static void calculate(){
        System.out.println("Please enter value of the first digit");
        int digit1 = getUserInput();
        System.out.println("Please enter value of the second digit");
        int digit2 = getUserInput();
        System.out.println("Please enter value of the third digit");
        int digit3 = getUserInput();

        boolean result = verifyTriangle(digit1, digit2, digit3);

        System.out.println(responseMessage(result));


}
}
