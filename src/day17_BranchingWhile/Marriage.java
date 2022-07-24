package day17_BranchingWhile;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Will you marry me?");
        String response= scan.next().toLowerCase();

        while (!(response.equals("yes") && response.equals("no"))) {

            if (response.equals("yes")) {
                System.out.println("Congrats!");
                break;
            } else if (response.equals("no")){
                System.out.println("So sorry for you!");
                break;
            } else {
                System.out.println("Invalid answer, please re-answer:");
                response = scan.next();

            }
        }
    }
}
