package com.novakivska.app.classwork.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tas_ka on 4/11/2017.
 */
public class Lesson10 {

    public static void main(String[] args) {
        System.out.println(stringEncode("Some string"));
        readerMethod();

    }

    public static String stringEncode(String stringToEncode) {
        String plainText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWZYZ abcdefghijklmnopqrstuvwxyz";
        String cypherText = "0987654321QWERTYUIOPASDFGHJKLZXCVB]45ææææææææææææææææææææææææææ";
        StringBuilder stringBuilder = new StringBuilder(stringToEncode);

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (stringBuilder.charAt(i) == plainText.charAt(j)) {
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void readerMethod() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:\\Учебка_Автомат"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }
}


