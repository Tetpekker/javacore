package com.novakivska.runners.homework18;

import com.novakivska.app.homework.homework18.ArraySorterGenerics;

/**
 * Created by Tas_ka on 5/24/2017.
 */
public class ArraySorterGenericRunner {

    private static Number[] numb = {8, 4, 9, 12};

    public static void main(String[] args){

        ArraySorterGenerics<Integer> asg = new ArraySorterGenerics<>(555, numb);
        asg.getArray();

    }
}
