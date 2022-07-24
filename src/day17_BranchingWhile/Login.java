package day17_BranchingWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        if ((username.equals("Cydeo") && password.equals("Cydeo123"))) {
            System.out.println("Logged in");
        } else {
            int attempts=3;
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0) {
                String remain = "Remaining attempts: ";
                System.err.println(remain + attempts );
                System.err.println("username or password is not correct");
                System.out.println("Enter your username");
                username = scan.next();
                System.out.println("Enter your password:");
                password = scan.next();
                attempts--;
                if (attempts == 1) {

                    System.err.println("This is your last attempt");
                }

            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.err.println("Your account is locked");
            }
        }
            scan.close();

        }
    }

