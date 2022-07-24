package day25_CustomMethods_Overloading;

import java.util.Arrays;

import static day25_CustomMethods_Overloading.reverse.reverseTheArray;

public class reversePractice {

    public static void main(String[] args) {
        int [] arr1 = {5,6,7,8,9};
        arr1 = reverseTheArray(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("--------------------");
        double [] arr2 = {3.1,4.1,5.1,6.1,7.1};
        arr2 = reverseTheArray(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("--------------------");
        char [] arr3 = {'A', 'B', 'C', 'D', 'Z'};
        arr3 = reverseTheArray(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("--------------------");
        String [] arr4 = {"Hello", "is", "joyfull", "word"};
        arr4 = reverseTheArray(arr4);
        System.out.println(Arrays.toString(arr4));

    }
}
