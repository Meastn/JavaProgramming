package Replit.Arrays;

import java.util.Scanner;

public class FindSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below
        int total = 0;
        for (int each : nums) {
            total += each;
        }
        System.out.println(total);
    }
}

/*
Given an array **num**, calculate the sum of all numbers in the array and print out to the console.

```
nums → [2, 1, 2, 3, 4]) → 12
nums → [2, 2, 0, 3, 5]) → 12
nums → [1, 3, 5, 7, 9]) → 25
```
 */