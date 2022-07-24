package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        char[] list = {'A', 'B', 'C', 'D'};
        list = replace(list, 2, 'Z');
        System.out.println(Arrays.toString(list));
        int[] nums = {1, 2, 3, 4, 5, 5, 2, 2, 4};
        String [] quote = {"Life", "is","a","river", "river", "is", "flowing", "water"};
        nums = replaceAll(nums, 4, 90);
        quote = replaceAll(quote, "is", "was");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(quote));
    }

    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static double[] replace(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static char[] replace(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    // -------
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;

    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;

    }

    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;

    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;

    }
}


/*
Create a method named replace that passes three parameters:
integer array, integer index, integer newElement

Ex :
arr = {1,2,3,4}

replace (2,30) => arr = {1,30,3,4}
create the same method for double, char and String arrays

 */