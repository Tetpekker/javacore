package com.novakivska.app.homework.homework10;
import java.util.Scanner;


public class CharsExtractor {

    public void extract(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter data array delimited by \";\"");
        char [] rawInput = scan.nextLine().toCharArray();
        String result = "";

        for (char character : rawInput) {
            if (Character.isAlphabetic(character)){
                result = result + character;
            }
        }
        System.out.println(result);
    }
}