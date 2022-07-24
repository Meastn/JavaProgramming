package day09_IfStatements;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year you want to lear if it is leap year or not:");
        int year = scan.nextInt();
        scan.close();


        boolean leapYear = year % 4 == 0;

        if (leapYear) {
            System.out.println("Year " + year + " is a leap year.");
        } else {
            System.out.println("Year " + year + " is not a leap year.");
        }

    }
}
