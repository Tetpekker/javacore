package com.novakivska.app.classwork.lesson6;

import sun.management.counter.Counter;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/24/2017.
 */
public class ScannerAgain {


    public static void comparasing() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter smth");
        int a = scanner.nextInt();
        System.out.println("Enter smth else");
        int b = scanner.nextInt();

        while (a > b) {
            a = a - 1;
            System.out.println(a + " " + " " + b);
            if (a <= b) {
                System.out.println(a + "<+" + b);
                System.exit(a);
            }
        }
    }

    public static void printing() {
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment a " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment a " + a);
    }

    public static void countEven() {
        int count = 0;
        for (int a = 0; a <= 20; a++) {
            if ((a % 2) == 0||a != 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void arrays() {
        int[] a = {1, 2, 3};
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a);
    }
}







