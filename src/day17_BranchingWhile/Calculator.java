package day17_BranchingWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        int x=0;

        System.out.println("Enter the first number:");
        int first = scan.nextInt();
        System.out.println("Enter the second number:");
        int second = scan.nextInt();
        int result=0;
        System.out.println("Enter a valid math operator:");
        char operator = scan.next().charAt(0);

            while (!(operator == '+' || operator == '-')) {
                System.out.println("Invalid Operator. Please enter a valid operator!");
                operator = scan.next().charAt(0);
            }
            System.out.println((operator == '+') ? first + second : first - second);
    }

}
