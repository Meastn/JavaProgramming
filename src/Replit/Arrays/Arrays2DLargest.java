package Replit.Arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays2DLargest {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows = inp.nextInt(), cols = inp.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            int max= arr[i][0];
            //int j1=0;
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
                if(max<arr[i][j]){

                    max= arr[i][j];
                   // j1=j;
                }

            }//end for cols
            System.out.println("max number is " + max);

        }//end for rows

        //TODO write your code below





    }//end main
}

/*
Given a 2d array of ints,

find the biggest number(int) in the array
and print it.
 */