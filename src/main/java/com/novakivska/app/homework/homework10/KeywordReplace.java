package com.novakivska.app.homework.homework10;
import java.util.Scanner;

public class KeywordReplace {

    public void extract(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string");
        String [] rawInput = scan.nextLine().split(" ");
        System.out.println("Please enter keyword");
        String keyword = scan.nextLine();
        String result = "";

        for (String word : rawInput) {
            if(word.equals(keyword)){
                word = "\n";
            }
            result = result + word + " ";
        }
        System.out.println(result);
    }
}
