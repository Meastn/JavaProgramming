package day09_IfStatements;
import java.util.Scanner;

public class NameOfTheMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of the month: ");
        int n = scan.nextInt();
        scan.close();

        if (n == 1) {
            System.out.println("Month name = January");
        } else if (n == 2) {
            System.out.println("Month name = February");
        } else if (n == 3) {
            System.out.println("Month name = March");
        } else if (n == 4) {
            System.out.println("Month name = April");
        } else if (n == 5) {
            System.out.println("Month name = May");
        } else if (n == 6) {
            System.out.println("Month name = June");
        } else if (n == 7) {
            System.out.println("Month name = July");
        } else if (n == 8) {
            System.out.println("Month name = August");
        } else if (n == 9) {
            System.out.println("Month name = September");
        } else if (n == 10) {
            System.out.println("Month name = October");
        } else if (n == 11) {
            System.out.println("Month name = November");
        } else if (n == 12) {
            System.out.println("Month name = December");
        } else {
            System.out.println("Invalid Entry");
        }

    }
}

/*

name of the month
 */