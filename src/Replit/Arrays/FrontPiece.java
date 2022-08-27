package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int arraySize = 0;
        int[] shortList = new int[2];
        int[] oneItemList = new int[1];

        for (int i = 0; i <2 ; i++) {

           if (size > 2) {
               shortList[i] = num[i];
           } else if (size ==1){
               oneItemList[0] = num[0];
           }
        }

        if (size > 2) {
            System.out.println(Arrays.toString(shortList));
        } else if (size ==1){
            System.out.println(Arrays.toString(oneItemList));
        }
}
}



/*
Given an int array **num** of any length,
print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Examples:

```
input: 1, 2, 3

output: [1, 2]
```

```
input: 1

output: [1]
```
```
input: 4, 5, 4, 3, 8

output: [4, 5]
```
 */