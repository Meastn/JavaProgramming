package day09_IfStatements;
import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your exam score: ");
        int score = scan.nextInt();
        scan.close();

        if (score>=60) {
            System.out.println("Congrats! You have passed");
        } else {
            System.out.println("Sorry. You have failed. Study more!");
        }


    }
}
