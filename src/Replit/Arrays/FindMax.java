package Replit.Arrays;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.
        int max=0;
        for (int i=0; i<nums.length-1;i++) {
           nums [i] = max;
            if (max > nums [i+1]) {
                max = nums [i];
            } else if (nums [i] < nums [i+1]) {
                max = nums [i+1];
            }
        }
        System.out.println(max);

    }
}

