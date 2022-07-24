package day09_IfStatements;
import java.util.Scanner;

public class AlcoholElligibility {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?: ");
        int age = scan.nextInt();
        scan.close();
        System.out.println("--------RESULT--------");

        if (age >= 21 ){
            System.out.println("You're elligible to buy alcohol.");
        }else {
            System.out.println("Sorry! You're not elligible to buy alcohol.");
        }
    }
}
