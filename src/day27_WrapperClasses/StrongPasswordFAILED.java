package day27_WrapperClasses;

import java.util.Scanner;

public class StrongPasswordFAILED {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check if your password is strong enough:");
        String password = scan.nextLine();
        char [] passChar = password.toCharArray();
        boolean condition = false;
        if (password.length() < 8 || password.contains(" ")) {
            condition = true;
        }
        while (condition) {

            if (password.length() < 8) {
                System.out.println("Enter a password with at least 8 characters:");
                password = scan.nextLine();
            } else if (password.contains(" ")) {
                System.out.println("Enter a password  without space:");
                password = scan.nextLine();
            } else {
                condition = false;
            }
        }
/*for (int i=0; i<passChar.length; i++) {
   Character.isLetter(i) ;
    if (Character.isLetter([i])) {
            System.out.println(true);
            password = scan.nextLine();

        } else {

            continue;
        }

 */
        /*} else  if (!Character.isUpperCase(passChar[i])){
            System.out.println("Your password should contain at least one uppercase letter:");
            password = scan.nextLine();
        } else if (!Character.isLetterOrDigit(passChar[i])) {
            System.out.println("Your password should contain at least one special character:");
            password = scan.nextLine();
        } else if (!Character.isDigit(passChar[i])) {
            System.out.println("Your password should contain at least one number:");
            password = scan.nextLine();
        }

         */
    }
        // System.err.println("Congrats! Your password is strong enough.");
    }

/*
boolean lowercase = Character.isLowerCase(passChar[i]);
        boolean uppercase = Character.isUpperCase(passChar[i]);
        boolean specialChar = Character.isLetterOrDigit(passChar[i]);
        boolean digit = Character.isDigit(passChar[i]);
 */

/*
Write a program that can verify if a password is a strong password. Characteristics of strong password are:
1. Password MUST be at least have 8 characters long, and should not contain space
2. Password should at least contain one uppercase letter
3. Password should at least contaign one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit

boolean r3= Character.isLetter(ch2); //  checks if the character is a letter
        boolean r31 = Character.isUpperCase(ch2); // checks if the char is upper case
 */