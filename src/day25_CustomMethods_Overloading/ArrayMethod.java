package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        System.out.println("------Integer Array----------");
        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5); // {1,2,3,4,5} creates a new array using addInteger method

        System.out.println(Arrays.toString(arr));
        System.out.println("------Double Array----------");
        double[] doubles = {1.5, 2.5, 3.5, 4.5};
        doubles= addDouble(doubles, 5.5);
        System.out.println(Arrays.toString(doubles));
        System.out.println("------String Array----------");
        String [] words = {"hello", "world", "this", "is", "a ", "nice"};
        words = addString(words, "day");
        System.out.println(Arrays.toString(words));
        System.out.println("------Char Array----------");
        char [] characters = {'A', 'B', 'C', 'D'};
        characters = addChar(characters, 'Z');
        System.out.println(Arrays.toString(characters));

    }

    public static int[] addInteger(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static String [] addString (String [] array, String element){

        String [] result = new String [array.length +1];

        int i=0;
        for (String each: array) {
            result[i++] = each;
        }
        result [i] = element; // assign the last element of the new Array which is +1 more than the source Array
        return result;
    }

    public static char [] addChar (char [] array, char element){

        char [] result = new char [array.length +1];

        int i=0;
        for (char each: array) {
            result[i++] = each;
        }
        result [i] = element;
        // result [result.length-1] = element de olabilir
        return result;
    }

}


/*
1. create a return method called addInteger that can ad an Integer after the last index of an integer array

{1,2,3,4}, add 5
new array = {1,2,3,4,5}

2. create a return method called addDouble that can add a double after the last index of a doulbe array
3. create a return method called addString that can add a String after the last index of a String array
4. create a return method called addChar that can add a Char after last index of a char array

 */