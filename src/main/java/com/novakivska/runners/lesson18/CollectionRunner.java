package com.novakivska.runners.lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Tas_ka on 5/23/2017.
 */
public class CollectionRunner {
    public static void main(String [] args){

        String bmw = "BMW";
        String audi = "AUDI";
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(bmw);
        arrayList.add(audi);
        System.out.println(arrayList);

        int theFirst = 123;
        int theSecond = 456;
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(theFirst);
        arrayList1.add(theSecond);
        arrayList1.remove(1);
        arrayList1.containsAll(arrayList1);
        arrayList1.add(theSecond);
        arrayList1.size();
        arrayList1.get(0);
        System.out.println(arrayList1);

        HashSet hs = new HashSet();
        hs.add("B");
        hs.add("A");
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("C");
        hs.add("E");
        hs.add("F");
        System.out.println(hs);

        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println(m1.get("Zara"));
        System.out.println(" Map Elements");
        System.out.println("\t" + m1);
        System.out.println(m1.get("Mahnaz"));
        System.out.println(m1.get("Daisy"));
        System.out.println(m1.get("Ayan"));
    }
}
