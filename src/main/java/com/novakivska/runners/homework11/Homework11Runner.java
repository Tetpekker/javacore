package com.novakivska.runners.homework11;

import com.novakivska.app.classwork.lesson9.Lesson9;
import com.novakivska.app.homework.homework11.Homework11A;
import com.novakivska.app.homework.homework11.Homework11B;
import com.novakivska.app.homework.homework11.Homework11C;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by Tas_ka on 4/30/2017.
 */
public class Homework11Runner {

    public static void main(String[] args) {

        Homework11A homework11A = new Homework11A();
        Homework11B homework11B = new Homework11B();
        Homework11C homework11C = new Homework11C();

        homework11A.homework11A();

        String inputFile = "src\\test\\resoucers\\export\\hm11.txt";
        String outputFile = "src\\test\\resoucers\\export\\hm11_out.txt";

        try {
            String rawInput = homework11B.readFile(inputFile);
            String [] rawData = homework11B.splitString(rawInput);

            String output = "";

            for (String word: rawData) {
                if(homework11B.isPalindrome(word)){
                    output = output + word + " is palindrome" + "\n";
                }else {
                    output = output + word + " is NOT palindrome" + "\n";
                }
            }
            //System.out.println(output);
            homework11B.writeFile(outputFile, output);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            homework11C.createFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
