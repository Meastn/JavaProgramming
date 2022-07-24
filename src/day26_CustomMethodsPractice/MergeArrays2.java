package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

public class MergeArrays2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {10,20,30, 40};
        int [] arr3 = mergeArrays2(arr1, arr2);
        System.out.println(arr3);
    }

    public static int [] mergeArrays2 (int [] arr1, int [] arr2){

        int [] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (int each : arr2) {
            result =ArraysUtility.addElements(result, each);
        }
        return result;

    }
}
