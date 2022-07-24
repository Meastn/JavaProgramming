package day21_ArraysUtilityForEachLoop;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        char [] chr1 = str1.toCharArray();
        char [] chr2 = str2.toCharArray();

        System.out.println(Arrays.toString(chr1));
        System.out.println(Arrays.toString(chr2));
        System.out.println("--------");

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        System.out.println(Arrays.toString(chr1));
        System.out.println(Arrays.toString(chr2));
        boolean anagram = Arrays.equals(chr1,chr2);
        System.out.println("anagram = " + anagram);
    }
}

// write a program that can check if str1 and str2 are built upon same characters