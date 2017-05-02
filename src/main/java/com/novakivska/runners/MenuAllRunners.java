package com.novakivska.runners;

import com.novakivska.runners.homework10.Homework10Runner;
import com.novakivska.runners.homework11.Homework11Runner;
import com.novakivska.runners.homework12.BicycleHomework12Runner;
import com.novakivska.runners.homework13.HumanRunner;
import com.novakivska.runners.homework3.Homework3Runner;
import com.novakivska.runners.homework4.SelectAppRunner;
import com.novakivska.runners.homework6.Homework6Runner;
import com.novakivska.runners.homework8.Homework8Runner;

import java.util.Scanner;

/**
 * Created by Tas_ka on 5/2/2017.
 */
public class MenuAllRunners {

    public static void main(String[] args) {
    menu();
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public static void menu (){
        System.out.println("Select required homework");
        int a = getUserInput();

        if(a == 3) {
            String [] args = {};
            Homework3Runner.main(args);
        } else if (a == 4) {
            String [] args = {};
            SelectAppRunner.main(args);
        } else if (a == 6) {
            String[] args = {};
            Homework6Runner.main(args);
        } else if (a == 8) {
            String[] args = {};
            Homework8Runner.main(args);
        } else if (a == 10) {
            String[] args = {};
            Homework10Runner.main(args);
        } else if (a == 11) {
            String[] args = {};
            Homework11Runner.main(args);
        } else if (a == 12) {
            String[] args = {};
            BicycleHomework12Runner.main(args);
        } else if (a == 13) {
            String[] args = {};
            HumanRunner.main(args);
        }
        else {
            System.out.println("Error!");
        }
    }
}

