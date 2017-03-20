package com.novakivska.app.homework.homework4;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/19/2017.
 */
public class SelectApp {

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public static void enter (){
        System.out.println("Select required app");
        int a = getUserInput();

        if(a == 1) {
            Triangle.calculate();
        } else if (a == 2) {
            Numbers.calculate();
        } else if (a == 3) {
            WhichIsBigger.calculate();
        } else {
            System.out.println("Error!");
        }
    }
}
