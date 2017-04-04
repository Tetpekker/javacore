package com.novakivska.app.classwork.lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.sun.xml.internal.bind.WhiteSpaceProcessor.replace;

/**
 * Created by Tas_ka on 3/31/2017.
 */
public class Lesson8 {
    public static void main(String[] args) {
        int[] array = {16, 8, 15, 2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        escape();
        charToString();
    }
    public static void escape(){
        System.out.println("\t bla-bla-bla");
        System.out.println("bla-bla-bla\b");
        System.out.println("bla-bla-bla \n");
        System.out.println("bla-bla-bla \r");
        System.out.println("bla-bla-bla \'");
        System.out.println("bla-bla-bla \"");
        System.out.println("bla-bla-bla \\");
    }

    public static void charToString(){
        char[] charsArray = {'t', 'a', 's'};
        String stringResult = charsArray.toString();
        System.out.println(charsArray);
        }

       // public static void replacing() {
       // String someString = "Stringaaaaa";
        //    String stringToDisplay = Array.toString(charToString)
        //.replace(",", "");
       // .replace("[", "");
       // .replace("]", "");
      //  .replace(" ", "");
      //  .trim();
      //  System.out.println(stringToDisplay);
      //}
    //String toFloat = "0,44";
    Integer intValue = new Integer(7);
    String seven = String.valueOf(intValue);
    Integer doubleInteger = new Integer(44);
    String fourtyFour = String.valueOf(doubleInteger);
    }


