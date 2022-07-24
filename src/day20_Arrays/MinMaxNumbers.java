package day20_Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int [] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers [i] = scan.nextInt(); // each entered
            // input will be assigned to the indexes of the array
        }

        int max = numbers[0];
        int min = numbers[0];
        int average = numbers [0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]> max){
                max = numbers[i];
            }
            if (numbers[i]<min){
                min = numbers[i];
            }
            // if (numbers[i]>min || numbers[i]<max){
            //    average = numbers [i];
            //}

        }
        System.out.println("Given numbers are: "+ Arrays.toString(numbers));
        System.out.println("min is = " + min);
        System.out.println("max is = " + max);
    }
}
