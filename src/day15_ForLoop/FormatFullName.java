package day15_ForLoop;
import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter your middle name:");
        String middleName = scan.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        middleName = ("" + middleName.charAt(0)).toUpperCase() + middleName.substring(1).toLowerCase();
        // in order to use charAt method for a String. First you have to convert it to a string.
        // you can convert any char to String by adding an empty "" and concenating the charAt to this empty ""
        lastName = lastName.toUpperCase();

        System.out.println("Citation Record: " + lastName + ", " + firstName + " " + middleName);

   scan.close();
    }
}

/*
Write a program that asks the user to enter its firs and last name, and then prints the full
name in regular format firstname, lastname (first character in UPPER CASE)
Input
firstName ="Cydeo"
lastName = "School"

Output
Cydeo, School
 */