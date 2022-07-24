package day15_ForLoop;
import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int max = -2147483648; // max=1 after first for loop run and adds incrementally
        int min = 2147483647; 
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt(); // user enters 1,2,3,4,5
            if (num>max) {
                max = num;
            }
            if (num<min) {
                min = num;
            }

            }
        System.out.println("Your biggest number is: "  + max);
        System.out.println("Your smallest number is: " + min);

        }
    }


/*
Write a program that asks the user enter a number for 5 times.
And return the maximum number

 */