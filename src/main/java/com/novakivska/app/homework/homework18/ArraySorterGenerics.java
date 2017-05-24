package com.novakivska.app.homework.homework18;

/**
 * Created by Tas_ka on 5/24/2017.
 */
public class ArraySorterGenerics<NUMB> {

    private NUMB numb;

    public ArraySorterGenerics(NUMB numb, Number[] array) {
        this.numb = numb;
        this.array = array;
    }
    Number[] array = {12.36, 52.5, 36, 8};
    public <U extends Comparable, Number> U[] bubbleSortingMaxToMin(U[] array) {
        U temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } return array;
    }

    public Number[] getArray() {
        System.out.println(array);
        return array;
    }
}
