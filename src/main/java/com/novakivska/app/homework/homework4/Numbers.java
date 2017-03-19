package com.novakivska.app.homework.homework4;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/19/2017.
 */
public class Numbers {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int a = scanner.nextInt();
        if ((a % 2) == 0){
            System.out.println("This number is even");
        } else{
            System.out.println("This number is odd");
        }
    }
}
