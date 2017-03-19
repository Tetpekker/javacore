package com.novakivska.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/17/2017.
 */
public class CircleArea {

    public static void calculateBigger(){
        int area1 = 50;
        int area2 = 10;

        if (area1 > area2) {
            System.out.println("Area1 is bigger");
        }else{
            System.out.println("Area2 is bigger");
        }
    }
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of the first circle radius");
        double radius1 = scanner.nextDouble();
        System.out.println("Please enter value of the second circle radius");
        double radius2 = scanner.nextDouble();
        if (radius1 > radius2 || calculateArea(radius1) > calculateArea(radius2)){
            System.out.println("Radius of the first circle is greater that the second");
        }else {
            System.out.println("Radius of the first circle is less that the second");
        }

    }
    public static double calculateArea(double radius){
        double circleArea = Math.PI * (radius * radius);
        return circleArea;
    }
}
