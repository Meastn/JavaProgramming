package day18_NestedLoops;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a number: ");
                int num = scan.nextInt();
                if (num % 2 == 0) {
                    System.out.println(num + " is an even number.");
                } else {
                    System.out.println(num + " is an odd number.");

                }
                System.out.println("Would you like to enter another number?");
                String answer = scan.next().toLowerCase();

                while ( !( answer.equals ("yes") || answer.equals("no") )) {
                    System.out.println("Invalid Entry.Would you like to enter another number?");
                    answer = scan.next().toLowerCase();
                }


                if (answer.equals("no")) {
                    System.out.println("Ending process");
                    break;
                }

            }

        }

    }


/*
Write a program that asks user to enter a numnber , and check if the
number is odd or even.
if it's odd, print "Odd Number"
if it's even, print "Even number"
Ask the user "Would you like to enter another number"
if user enters yes, repeat the previous steps
if user enters no, print nothing
If user enteres invalid answer, repeat the previous ste
 */