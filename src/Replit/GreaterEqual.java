package Replit;

import java.util.Scanner;

public class GreaterEqual {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //CODE HERE:
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}




