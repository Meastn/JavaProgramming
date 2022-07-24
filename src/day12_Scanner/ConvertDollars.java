package day12_Scanner;

import java.util.Scanner;

public class ConvertDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int dollars = (int) cents/100;
        int remainingCents = cents - (dollars*100);


        System.out.print(cents + " cents equal to: " + dollars + " dollars and " + remainingCents + " cents");

    }
}


/*
Write a program that can convert cents to dollars, if there is
any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */