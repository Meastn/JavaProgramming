package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        
        String [] arr = sentence.split(" ");

        for (int i=arr.length-1, j=0; i>=0; i--,j++){

            reversed += arr[i] + " ";
        }
        //reversed = Arrays.toString(reverse);

        System.out.println(sentence);
        //End your code here. do not modify below statement
        reversed= reversed.trim();
        System.out.println(reversed);

    }
}
/*
 for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
 */
/*
Given a String variable
**sentence,** write code to get each word
and assign to String **reversed** in reverse order.

Example:

```
sentence -> Java is fun

reversed > fun is Java
```
 */