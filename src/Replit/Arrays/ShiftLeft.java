package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] temp = new int[size];
        int moving = nums[0];
        for (int i = 0; i < size-1; i++) {
            temp[i] = nums [i+1];
        }
        temp[size-1]= moving;
        System.out.println(Arrays.toString(temp));
    }
}

/*
Modify an array that is
"left shifted" by one -- so {6, 2, 5, 3}
becomes {2, 5, 3, 6}. You may modify
and print the given array, or print a new array.`

Example:
```
input: 6, 2, 5, 3

output: [2, 5, 3, 6]
```
 */

