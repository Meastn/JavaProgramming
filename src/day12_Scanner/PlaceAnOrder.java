package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("What is your order?:");
        String order = scan.nextLine();
        System.out.print("enter the price:");
        double price = scan.nextDouble();
        System.out.print("enter the quantity:");
        int quantity = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your first name:");
        String name= scan.next();

        System.out.println(name + ", your order for " + quantity + " " + order + " has been placed. Your total is $" + (quantity*price));
    }
}


/*

PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

 */