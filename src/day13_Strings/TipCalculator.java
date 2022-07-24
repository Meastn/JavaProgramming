package day13_Strings;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Is there a split?: ");
        String split = scan.next();
        double tip = 0;
        System.out.println("Enter the number of people: ");
        int numberOfPeople = scan.nextInt();
        System.out.println("Enter the check amount: ");
        int checkAmount = scan.nextInt();
        System.out.println("How was the service quality?:");
        String serviceQuality = scan.next();

        System.out.println("Number of people entered:" + numberOfPeople);

        if (serviceQuality.equals("Excellent")) {
            tip = 0.25;
        } else if (serviceQuality.equals("Great")) {
            tip = 0.20;
        } else if (serviceQuality.equals("Good")) {
            tip = 0.20;
        } else if (serviceQuality.equals("Fair")) {
            tip = 0.10;
        } else if (serviceQuality.equals("Poor")) {
            tip = 0.05;
        } else {
            System.out.println("Invalid Entry!");
        }


        double tipAmount = tip * checkAmount;
        double totalAmount = (tip * checkAmount) + checkAmount;

        System.out.println("Total to pay: " + totalAmount);
        System.out.println("Total tip: " + tipAmount);



        if (split.equals("Yes")) {
            System.out.println("Total Amount per person: " + (double) (totalAmount/numberOfPeople));
            System.out.println("Tip per person: " + (double) (tipAmount / numberOfPeople));
        } else {
            System.out.println("Total Amount not shared ");
            System.out.println("Tip is not shared");
        }




        scan.close();
    }
}


/*
Create a class called TipCalculator, write a program for a tip
calculator.
There will be different service quality benchmarks that will determine the
tip given.
There will also the ability to calculate based on the number of people in
the party and if there is a split of the bill or not.
Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent
= 25%
The program should display the following information based on the
user input:
Split or No split (Yes or No),  Number of people entered: (number)
(each person = & in output) Check amount: (number) Service Quality:
(String) Total to pay: Total tip: Total per person: Tip per person:
Ex:
Split or No split (Yes or No)?
Yes
Enter the number of people
4
Enter the check amount:
476
How was the srvice quality?
(Excellent/Great/Good/Fair/Poor)
Excellent
output:
Number of people entered: 4
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
HINT: you will need to use .equals() method
 */