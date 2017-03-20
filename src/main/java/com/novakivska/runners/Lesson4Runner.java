package com.novakivska.runners;

import com.novakivska.app.homework.homework4.Numbers;
import com.novakivska.app.homework.homework4.SelectApp;
import com.novakivska.app.homework.homework4.Triangle;
import com.novakivska.app.homework.homework4.WhichIsBigger;

import java.util.Scanner;

/**
 * Created by Tas_ka on 3/19/2017.
 */
public class Lesson4Runner {

    public static void main(String[] args) {

        System.out.println(welcome());
        System.out.println(menu());
        boolean exit = false;
        while (exit == false) {
            int userInput = userInputNormalize(getUserInput());
            switch (userInput) {
                case 0:
                    printDelimiter();
                    System.out.println(menu());
                    break;
                case 1:
                    Triangle.calculate();
                    printDelimiter();
                    System.out.println(menu());
                    break;
                case 2:
                    Numbers.calculate();
                    printDelimiter();
                    System.out.println(menu());
                    break;
                case 3:
                    WhichIsBigger.calculate();
                    printDelimiter();
                    System.out.println(menu());
                    break;
                case 4:
                    SelectApp.enter();
                    printDelimiter();
                    System.out.println(menu());
                    break;
                default:
                    System.out.println("Exit");
                    exit = true;
            }
        }
    }


    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        return value;
    }

    public static String welcome() {
        String welcome = "Hello!";
        return welcome;
    }

    public static String menu() {
        String menu = "\tIf you want to print this menu again - input 0.\n" +
                "\tIf you want to run the Triangle - input 1.\n" +
                "\tIf you want to run the Numbers - input 2.\n" +
                "\tIf you want to run the WhichIsBigger - input 3.\n" +
                "\tIf you want to run Select - input 4.\n" +
                "\tIf you want to exit - input any other number.\n";
        return menu;
    }

    public static void printDelimiter() {
        System.out.println("\n===================================================================================\n");
    }


    public static int userInputNormalize(String input) {
        int normalized;
        try {
            normalized = Integer.parseInt(input);
        } catch (Exception ex) {
            System.out.println("Incorrect input. We will try to cast your input to integer");
            System.out.println("Whoops! We cannot cast your input, please, try again!!!\n");
            normalized = 0;
        }
        return normalized;
    }

}

