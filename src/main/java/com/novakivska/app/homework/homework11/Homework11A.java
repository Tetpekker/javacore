package com.novakivska.app.homework.homework11;

import com.novakivska.app.classwork.lesson8.Lesson8;

import java.io.FileWriter;
import java.io.IOException;

public class Homework11A {

    public static final int string = 10;

    public void homework11A(){
        Lesson8 bubbleSort = new Lesson8();
        int numbArray[]= {9,8,7,6,5,4,3,2,1,0};

        //numbArray = new int[string];
        FileWriter myFile = null;

        try {
            myFile = new FileWriter("src\\test\\resoucers\\export\\myFile.txt");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        int [] sorted = bubbleSort.arraySorted(numbArray);


        for (int i : sorted) {
            System.out.println("Numbers of this array are: " + i);
            try {
                myFile.write(i + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
