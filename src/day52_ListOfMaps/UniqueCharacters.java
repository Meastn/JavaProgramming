package day52_ListOfMaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str ="aaabccccdeeeef";

        Map<String, Integer> result = new LinkedHashMap<>();

        String [] arr = str.split("");

        for (String each : arr) {
            int frequency = Collections.frequency( Arrays.asList(arr), each);
        if (frequency==1){
            result.put(each, 1);
        }
        }

        System.out.println(result);






    }

}

/*
Write a program that can find the unique characters from a String


Ex.
str ="aaabccccdeeeef"

output = {b=1, d=1, f=1}


 */
