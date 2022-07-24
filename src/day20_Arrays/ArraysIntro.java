package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        // create an array that can contain 5 student names

        System.out.println("How many students are there?");
        int size = scan.nextInt();
        String students[] = new String [size];
        // System.out.println(students); // this will give hashcode (@) error

        // Arrays is a class
        // and it is contained in java.util
        students[3] = "Melih";
        System.out.println(Arrays.toString(students)); // it automatically imports java.util.Arrays in INTELLIJ
        int numbers[] = new int[5];

        numbers[2] = 3;
        numbers[4] = 744;
        students[2] = students[3];
        students[3] = "c'mon";

        System.out.println(Arrays.toString(numbers)); // null values for primitive (int) data type
        System.out.println(Arrays.toString(students));

        System.out.println("-----------------");

        String days[]= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        System.out.println(Arrays.toString(days));
        System.out.println(days[6]);

    }
}


// default values
// for all non-primiteves is "null"
// for  primitives  char, long,  is 0
// for primitives float, double is 0.0;
// for primitive boolean is false;