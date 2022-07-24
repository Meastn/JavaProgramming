package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        System.out.println("---------Merging Two Integer Arrays----------");
        int []arr1 = {2,34,3,6,14};
        int [] arr2 = {71,72,73,81};

        int [] result = mergeArrays.mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
        System.out.println("---------Merging Two Decimal Arrays----------");
        double [] arr3 = {2.7,34.1,3.4,6.8,14.3};
        double [] arr4 = {71.5,72.4,73.3,81.2};

        double [] result2 = mergeArrays.mergeArrays(arr3, arr4);
        System.out.println(Arrays.toString(result2));
        System.out.println("---------Merging Two String Arrays----------");
        String [] arr5 = {"How", "should", "I", "know"};
        String [] arr6 = {"that", "you", "are", "serious"};
        String [] result3= mergeArrays.mergeArrays(arr5, arr6);
        System.out.println(Arrays.toString(result3));
        System.out.println("---------Merging Two Char Arrays----------");
        char [] arr7 = {'H', 'A', 'i', 'k'};
        char [] arr8 = {'h', 'u', 'p', 's'};
        char [] result4= mergeArrays.mergeArrays(arr7, arr8);
        System.out.println(Arrays.toString(result4));
    }
}
