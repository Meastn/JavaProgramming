package day27_WrapperClasses;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        String [] nums = {"kal", "kal", "ilk","kal","kal", "son"};
        nums = swapElements(nums, 2, 5);
        System.out.println("Nums = " + Arrays.toString(nums));
    }

    public static int[] swapElements(int[] array, int firstIndex, int secondIndex) {

        int [] result = new int [array.length+1];

        result[result.length-1] = array [firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = result[result.length-1];
        return array;

    }
    public static double[] swapElements(double[] array, int firstIndex, int secondIndex) {

        double [] result = new double [array.length+1];

        result[result.length-1] = array [firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = result[result.length-1];
        return array;

    }
    public static char[] swapElements(char[] array, int firstIndex, int secondIndex) {
        char [] result = new char [array.length+1];

        result[result.length-1] = array [firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = result[result.length-1];
        return array;

    }
    public static String [] swapElements(String [] array, int firstIndex, int secondIndex) {
        String [] result = new String [array.length+1];

        result[result.length-1] = array [firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = result[result.length-1];
        return array;

    }
   
}


/* SWAP METHODS WILL BE ADDED total 56 methods

Swap Task:
2.1 Create a method named swap that passes three parameters: integer 
array, integer i, integer j. the method swaps the element at index i with 
the element at index j, and returns the new array
Ex:
arr = {10, 20, 30, 40, 50};
swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
 */