package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveToLastIndex {
    public static void main(String[] args) {
        // FIRST SOLUTION --WITHOUT A NEW ARRAYLIST
        // measure the size of the ArrayList
        // remove all 0's from ArrayList
        // Remeasure the size of the ArrayList without 0's
        // subtract old size from the new Size to find total number of 0's that will be added
        // create a loop that runs as much as the number of 0's
        // for each loop add a 0 to the ArrayList
        // since add function adds to the end of the ArrayList
        // All the 0's in the ArrayList will be added to the end of ArrayList
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll (Arrays.asList(1,0,2,0,3,0,4,0)) ;
        System.out.println(list);
        int size= list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = size - newSize;
        System.out.println(list);
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("-------WITH A NEW ARRAY LIST--------");
        // Create an Integer ArrayList
        // Create a for each loop to check each index
        // For each loops add each index of the list2 ARRAYLIST to the result ARRAYLIST if they are not 0'b
        // Second for each loop checks list2 indexes one by one if it is equal to 0 and adds to the end of the ARRAYLIST
        // since the total size of list2 is equal to result number of 0's that will be added to the end of the list is predetermined
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll (Arrays.asList(1,0,2,0,3,0,4,0)) ;
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each !=0) {
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if (each ==0) {
                result.add(each);
            }
        }
        System.out.println(list2);
        System.out.println(result);


    }



}


// Array is a data structure
// Arrays class is a utility class for Array data structure

/*
Write a program that can move all the zeros to the end of the ArrayList
Condition:
You have to work with only one ArrayList. Do not create a second ArrayList.


Ex.
{1,0,2,0,3,0,4,0}
output
{1,2,3,4,0,0,0,0}
 */