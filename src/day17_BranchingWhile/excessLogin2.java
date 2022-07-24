package day17_BranchingWhile;

import java.util.Scanner;

public class excessLogin2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        for (int i = 0; i < 3; i++) {
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in");
            }
            if (!(username.equals("Cydeo") && password.equals("Cydeo123"))){

            }


        }
    }
}
