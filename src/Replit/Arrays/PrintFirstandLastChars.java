package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstandLastChars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter words to be processed: ");
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        //TODO: Write your code below
        String [] shorts= new String [(words.length)];

       for (int i=0; i<words.length; i++){
           shorts [i] = words[i].charAt(0) + words[i].substring(words[i].length()-1)+ "";
           //shorts [i] =shorts;
       }
        System.out.println(Arrays.toString(shorts));
    }
}





/*
Given a String array **words**,
iterate through each word and print first
and last letter of each element in the format below.

Example:

```
words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
```


 */