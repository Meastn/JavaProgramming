package day16_ForLoopStringPractices;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int negative= 0, positive = 0;
        for (int i =1; i<=5; i++) {

            System.out.println("Enter a positive or negative number");
            int number = scan.nextInt();
            if (number < 0) {
                negative = negative + 1;
            }
            { if (number > 0){
                positive = positive + 1;
            }
            }

        } System.out.println("Positive numbers you've entered: " + positive);
        System.out.println("Negative numbers you've entered: " + negative);
    }
}

/*
Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */