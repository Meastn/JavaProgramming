package Replit;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan= new Scanner (System.in);
        System.out.println("Welcome to the patient portal!" + "\n Please enter your personal information");
                System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        Long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        Long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        Double height = scan.nextDouble();
        System.out.println("Enter your weight");
        Double weight = scan.nextDouble();
        System.out.println("Are you married?");
        Boolean isMarried  = scan.nextBoolean();
        String fullName = "Full Name: " + lastName + ", " + firstName;
        String contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber;
        String address = "Address: " + street + ", "+ city +", " +  state + " " + zipCode;

        System.out.println("Patient personal information " + fullName + " " + address + " " + contacts + ", email: " + email + " Age: " + age + " Height: " + height + " Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);
    }
}