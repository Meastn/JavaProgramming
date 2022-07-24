package day21_ArraysUtilityForEachLoop;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7};
        int[] arr2 = {8, 9, 10, 11};
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i];
            }
        for (int i = arr1.length+1; i < arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        /*
        int i = 0;
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }

         */


    }
}
