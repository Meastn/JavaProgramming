package day18_NestedLoops;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String u= scan.next();
        System.out.print("Enter your password: ");
        String p= scan.next();
        int count=3;

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in!");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Left attempts: " + count);
                count --;

                System.out.println("Incorrect username or password");
                System.out.print("Enter your username: ");
                u = scan.next();
                System.out.print("Enter your password: ");
                p = scan.next();
                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("You are logged in!");

                    break;
                }
            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {

                System.err.println("Your account is locked. Contact Support for help!");

            }

        }

    }
}

/*
You are writing a code for the log-in function of the Cydeo
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials.
If credentials are matched, your program should
print "Logged in."
If the credentials are not matched, the program
should allow the user to have three attempts to enter correct credentials
and if all three attempts are failed, then print "Your account is locked.
 */