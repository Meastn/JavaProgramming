package day08_IfStatement;
import java.util.Scanner;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter a number please:");
        int number = scan.nextInt();

        boolean evenNumber =  number % 2 == 0;

        if (evenNumber) {
            System.out.println( number + " is an even number");
        }

        if (!evenNumber) {
            System.out.println( number + " is an odd number.");
        }
        System.out.println("---------------");
        System.out.print("Enter another number: ");
        int a = scan.nextInt();
        scan.close();

        // positive
        if (a>0) {
            System.out.println( a + " is a positive number ");
        }
        // negative
        if (a<0) {
            System.out.println( a + " is a negative number");
        }
        // zero
        if (a == 0) {
            System.out.println( a + " equals to zero");
        }

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */
    }
}
