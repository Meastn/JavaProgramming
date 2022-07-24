package day16_ForLoopStringPractices;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text to analyze: ");
        String str= scan.nextLine();

        String digits =""; //12345
        String letters = ""; // CydeoWoodenSpoon
        String specialChars =""; // !@$%


        for (int i=0; i<str.length();i++) {
            char ch = str.charAt(i); // ch. every single character in the string str

            if (ch >= '0' && ch <= '9'){ // any digit would be within 0 and 9
                if (ch != '0') {
                    digits += ch;
                }// add any digits between 0 and 9 to digits string
            } else if (ch >= 'a' && ch <= 'z') { // any small case letters would be within a to z
                letters += ch; // add any small case letter to letters string
            } else if (ch >= 'A' && ch <= 'Z'){ // any bigger case letters would be between A and Z
                letters += ch; // add any bigger case letters to letters string
            } else { // any non-digit, non-small case letter, non-bigger case letter belongs to special characters
                if (ch !=' ') {
                    specialChars += ch; // add any non-digit, non-sc letter, non-bc letter to specialChars string
                }
                }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
