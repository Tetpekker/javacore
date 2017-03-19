package com.novakivska.app.homework.homework4;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/19/2017.
 */
public class Triangle {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of the first digit");
        int digit1 = scanner.nextInt();
        System.out.println("Please enter value of the second digit");
        int digit2 = scanner.nextInt();
        System.out.println("Please enter value of the third digit");
        int digit3 = scanner.nextInt();
        if ((digit3 * digit3) == (digit1 * digit1) + (digit2 * digit2)){
            System.out.println("This is a right-angled triangle");
    } else{
            System.out.println("This is not a right-angled triangle");
        }
}
}
