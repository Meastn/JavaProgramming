package Replit;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cents do you have: ");
        int cents = scan.nextInt();
        int quarters = (int) cents / 25;
        int dime = (int) (cents - (quarters*25)) / 10;
        int nickels = (int) (cents - (quarters*25) - (dime*10)) / 5;
        int pennies = (int) (cents - (quarters*25) - (dime*10) - (nickels*5));

        if (cents >= 1 && cents <= 100) {
            System.out.println("Your change is " + quarters + " quarters, " + dime + " dimes, "
                    + nickels + " nickels, " + pennies + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }
    }
}

/*
Write a program that will determine the change given from the vending machine.
The program will accept the cents amount and output the change in quarters, dimes, nickels,
and pennies.

The given cents value should be more than 0 and less than 100. If the given cents is not in
the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format: Your change is x quarters, x dimes,
x nickels, and x pennies

1 cent = 1 penny
5 cent = 1 nickel
10 cent = 1 dime
25 cent = 1 quarter
Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies

 */