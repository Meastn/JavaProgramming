package day51_Maps;

import java.util.*;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        String str ="aabbbcdddceaabb";
        // firs get repeating characters individually a, b, c, d, e

        // collections.frequency convert the string to collection
        String [] arr= str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();//{b=2, c=3, d=2}

        for (String each : arr) {
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }

        System.out.println("result = " + result);
    }

}


/*
Write a program that can return the frequency of characters
Note: Must use map
ex : str ="aaabbbcdddceaabb";

output:
{b=2, c=3, d=2}
 */