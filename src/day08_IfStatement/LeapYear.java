package day08_IfStatement;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter the year: ");
        int year = scan.nextInt();
       scan.close();

       boolean isLeapYear = year % 4 == 0;

        System.out.println(year + " is a Leap Year:" + isLeapYear);
    }
}
