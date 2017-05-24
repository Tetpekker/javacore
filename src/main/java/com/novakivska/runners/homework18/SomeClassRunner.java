package com.novakivska.runners.homework18;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Tas_ka on 5/24/2017.
 */
public class SomeClassRunner {

        public static void main(String [] args){
            System.out.println("Please enter word");
            Scanner scanner = new Scanner(System.in);
            int len = 1;
            HashSet hs = new HashSet();

            while (len > 0){
                String input = scanner.nextLine();
                len = input.length();
                hs.add(input);
            }

            for (Object word: hs) {
                if(word.toString().length() != 0){
                    System.out.println(word.toString());
                }
            }
        }
    }

