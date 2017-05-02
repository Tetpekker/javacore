package com.novakivska.app.classwork.lesson8;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.sun.xml.internal.bind.WhiteSpaceProcessor.replace;

/**
 * Created by Tas_ka on 3/31/2017.
 */
public class Lesson8 {
    public static void main(String[] args) {

        escape();
        charToString();
        convert();
    }

    public int [] arraySorted(int[] array){
        //int[] array = {16, 8, 15, 2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        //System.out.println(Arrays.toString(array));
        return array;
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
    public static void convert() {
        Integer intValue = new Integer(7);
        String seven = String.valueOf(intValue);
        System.out.println(seven);

        Boolean boleanValue = new Boolean(true);
        String fourtyFour = String.valueOf(boleanValue);
        System.out.println(fourtyFour);

        Double doubleValue = new Double(2);
        String Doublestring = String.valueOf(doubleValue);

        Long longValue = new Long(1234_5678_9012_3456L);
        String longvalue = String.valueOf(longValue);
    }
    }


