package com.novakivska.app.classwork.lesson9;

import com.sun.security.auth.SolarisNumericUserPrincipal;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

import static com.sun.xml.internal.bind.WhiteSpaceProcessor.replace;

/**
 * Created by Tas_ka on 4/4/2017.
 */
public class Lesson9 {

    public static void main(String [] args) {

      // palind();
       String userInput = splitMethod();
       reverseWord(userInput);
    }

    public static void palind() {

        String palindrome = "wow";
        boolean isPalindrome = true;

        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static String splitMethod(){
        System.out.println ("Enter some words with spaces");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(" ");
        return splittedStringArray[0];
        /*
        System.out.println(Arrays.toString(splittedStringArray)
                .replace("[", "")
                .replace("]", ""));*/
    }

    public static void reverseWord(String palindrome){
        StringBuilder builder = new StringBuilder(palindrome);
        builder.reverse();
             if(palindrome.equals(builder.toString())) {
                 System.out.println("Palindrome");
             }else {
                 System.out.println("Not a palindrome");
             }
        }
    }




