package Replit.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintShortest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll(" ", ",");
        String[] wordList = str.split(",");
        String container = "";
        String shortList ="";
        for (int i = 0; i < wordList.length - 1; i++) {
            if (wordList[0].length() < wordList[i + 1].length()) {
                container = wordList[0];
            } else {
                container = wordList[i + 1];
            }
        }

        for (int j = 0; j < wordList.length ; j++) {
            if (wordList[j].length()== container.length() ){
                shortList += wordList[j] + ", ";
            }
        }


        shortList =shortList.trim().replaceAll(" ","");

        String [] result = shortList.split(",");
        Arrays.sort(result);

        System.out.println(Arrays.toString(result));

    }
}


/*
Write a program that will find
out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and
create an array of strings.  Print array with Arrays.toString() method.
Sort array before printing.

> Hint: Split values by comma: split(", ");

```
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
```
 */