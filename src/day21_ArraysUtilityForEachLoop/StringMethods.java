package day21_ArraysUtilityForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String email= "Once upon a time there was a king. He was wise. He was smart. But he was lazy. ";

        String [] arr1= email.split("\\.");

        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[0]);

    }
}
