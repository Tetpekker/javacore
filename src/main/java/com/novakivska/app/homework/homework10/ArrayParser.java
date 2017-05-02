package com.novakivska.app.homework.homework10;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayParser {

    public static void sortArray(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter integers delimited by \";\"");
        String [] rawInput = scan.nextLine().split(";");
        System.out.println("Please choose sorting order (\"A\" for ascending, \"D\" for descending)");
        String sortOrder = scan.nextLine().toLowerCase();

        int [] parsedIntegers = new int[rawInput.length];

        try {
            for (int i = 0; i < rawInput.length; i++) {
                parsedIntegers[i] = Integer.parseInt(rawInput[i]);
            }
        }catch (Exception ex){
            System.out.println("We ask you for integers!");
        }

        if(sortOrder.equals("a")){
            Arrays.sort(parsedIntegers);
        }else if(sortOrder.equals("d")){
            int[] result = new int[parsedIntegers.length];
            Arrays.sort(parsedIntegers);
            for(int i = 0; i < result.length; i++){
                result[i] = parsedIntegers[parsedIntegers.length - 1 - i];
            }
            parsedIntegers = result;
        }else {
            System.out.println("Incorrect sorting order");
        }

        String result = "";
        for (int value: parsedIntegers) {
            result = result + value + "; ";
        }
        System.out.println(result);
    }
}