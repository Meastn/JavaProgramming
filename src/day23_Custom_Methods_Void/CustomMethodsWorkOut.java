package day23_Custom_Methods_Void;

import java.util.Scanner;

public class CustomMethodsWorkOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your birth year:");
        //int birthYear = scan.nextInt();
        //DisplayAge(birthYear);
       // EvenOrOdd(44);
        /*System.out.print("Enter first number: ");
        int x = scan.nextInt();
        System.out.println();
        System.out.print("Enter second number: ");
        int y = scan.nextInt();

         */
        printNumbers(10,20);
    }

    // create a function that can check if the given number is odd or even
    public static void EvenOrOdd (int number) {

        if (number % 2 == 0){
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }

    // create a function that can display the age of the person
    public static void DisplayAge (int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("Your age is " + age);


    }

    // create a function that can print all the numbers between x and y
    public static void printNumbers (int x, int y) {

        for (int i=x; i<y; i++) {
            x = x+1;
            System.out.print(x + ", ");
        }

    }
}
