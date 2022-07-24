package day26_CustomMethodsPractice;

import java.util.Arrays;

public class mergeArrays3 {
    public static void main(String[] args) {
        int [] arr1 = {1,5,9,11,14,56};
        int [] arr2 = {10,20,30,0,50};
        int [] arr3 = mergeArrays3 (arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int [] mergeArrays3 (int [] arr1, int [] arr2) {
    int [] result = new int [arr1.length + arr2.length];
    int i=0;

    for (int each : arr1) {
        result [i++] = each;
    }
    for (int each : arr2) {
        result [i++] = each;
    }
    return result;
    }
}
