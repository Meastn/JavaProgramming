package day08_IfStatement;
import java.util.Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of month to see how many days it has:");
        int numberOfTheMonth = scan.nextInt();
        scan.close();
        // int numberOfTheMonth= 7;
        boolean month28Days = numberOfTheMonth == 2,
            month30Days = numberOfTheMonth == 4 || numberOfTheMonth == 6 || numberOfTheMonth == 9 || numberOfTheMonth == 11,
            month31Days = !month28Days && !month30Days;


        if (month31Days) {
            System.out.println("This month has 31 days");
        }
        if (month30Days) {
            System.out.println("This month has 30 days");
        }
        if (month28Days) {
            System.out.println("This month has 28 days");
        }

    }

}

/*
Write a program that can print the number of days in a month
Ex:
number = 1;
output:
31 Days
Hints:
Months that has 31 days : 1,3,5,7,8,10,12
Months that has 30 days : 4,6,9,11
Months that has 28 days :2

 */