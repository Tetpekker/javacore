package com.novakivska.app.homework.homework11;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Homework11C {

    public void createFile() throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter filename ");
        String fileName = "src\\test\\resoucers\\export\\" + scanner.nextLine();
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        boolean hasNext = true;
        while (hasNext) {
            String line = scanner.nextLine();
            if (!line.equals("exit")) {
                writer.println(line);
            } else {
                writer.close();
                hasNext =false;
            }
        }
    }
}
