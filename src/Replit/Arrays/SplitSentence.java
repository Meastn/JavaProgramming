package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] arr= sentence.split(" ");

        for (String each : arr) {
            System.out.println(each);
        }

        //type your code below

    }
}


/*
Given a String variable **sentence,** write code to type each word in separate lines.

Example:

```
sentence -> "Java is fun"

Print

Java
is
fun
```
 */