package Replit;

import java.util.*;

public class TipCalculator {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();
        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        scan.nextLine();
        String serviceQuality = scan.nextLine();
        double tip = 0;
        String personSign = "&";


        switch (serviceQuality) {
            case "Fair":
                tip = checkAmount * 0.10;
                checkAmount = tip + checkAmount;
                break;
            case "Good":
                tip = checkAmount * 0.15;
                checkAmount = tip + checkAmount;
                break;
            case "Great":
                tip = checkAmount * 0.20;
                checkAmount = tip + checkAmount;
                break;
            case "Excellent":
                tip = checkAmount * 0.25;
                checkAmount = tip + checkAmount;
                break;
            default:
                tip = checkAmount * 0.05;
                checkAmount = tip + checkAmount;
        }
        // for (int i = 0; i < numberOfPeople; i++) {

        //         str = ;

        //     }
        System.out.println("Number of people entered: " + personSign.repeat(numberOfPeople));
        System.out.println("Total to pay: " + checkAmount);
        System.out.println("Total tip: " + tip);
        switch (split) {
            case "Yes":
                System.out.println("Total per person: " + (checkAmount / numberOfPeople));
                System.out.println("Tip per person: " + (tip / numberOfPeople));
                break;
            default:
                System.out.println("No split");
        }
    }
}