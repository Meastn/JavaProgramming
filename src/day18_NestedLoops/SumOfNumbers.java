package day18_NestedLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter first number: ");
        int num1= scan.nextInt();
        System.out.print("Enter second number: ");
        int num2= scan.nextInt();
        int result=0;
        
        while (!(num1<0 || num2<0)) {
                result = num1 + num2;
                System.out.println("result = " + result);
                System.out.print("Enter a new first number: ");
                num1 = scan.nextInt();
                if (num1<0) {
                    System.out.println("Sorry. We don't accept negative numbers.");
                    break;
                }
                System.out.print("Enter a new second number: ");
                num2 = scan.nextInt();
            if (num2<0) {
                System.out.println("Sorry. We don't accept negative numbers.");
                break;
            }
            }
        }
    }


/*
Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop
 */