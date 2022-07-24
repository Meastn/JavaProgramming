package day08_IfStatement;
import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Give the number of the day: ");
        int numberOfDay = scan.nextInt();
        scan.close();

        if (numberOfDay == 1) {
            System.out.println("Monday");
        }
        if (numberOfDay == 2) {
            System.out.println("Tuesday");
        }
        if (numberOfDay == 3) {
            System.out.println("Wednesday");
        }
        if (numberOfDay == 4) {
            System.out.println("Thursday");
        }
        if (numberOfDay == 5) {
            System.out.println("Friday");
        }
        if (numberOfDay ==6) {
            System.out.println("Saturday");
        }
        if (numberOfDay == 7) {
            System.out.println("Sunday");
        }

    }
}

/*
Write a program that displays the name of the month
 */