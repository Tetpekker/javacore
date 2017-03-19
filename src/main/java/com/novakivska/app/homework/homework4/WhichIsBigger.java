package com.novakivska.app.homework.homework4;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/19/2017.
 */
public class WhichIsBigger {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int a = scanner.nextInt();
        System.out.println("Please enter the 2nd number");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("The 1st number is bigger");
        } else{
            System.out.println("The 2nd number is bigger");
        }
    }
}
