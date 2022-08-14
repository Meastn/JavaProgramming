package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxLengthString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        //write your code below
        String carrier="";
        for (int i=0; i<words.length-1;i++) {
            if (words[i+1].length()> words[i].length()){
                words[i] = words[i+1];
                carrier = words[i+1];
            }
        }
        System.out.println(carrier);
    }
}


/*
Given the array **words** find and print the word with the largest length. Assume that there are no 2 words with longest length

Example:
```
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
```
 */