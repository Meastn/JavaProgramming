package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,4,6,8,10,12,14,16,18));
        System.out.println(list);

        Collections.swap(list, 0, list.size()-1);
        System.out.println("list = " + list);
    }
}



/*
Write a program that can swap first and last elements of an ArrayList
 */