package day16_ForLoopStringPractices;

import java.util.Locale;
import java.util.Scanner;

public class charFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a text: ");
        String str = scan.nextLine();

        System.out.println("Enter a character to check its frequency: ");
        char ch = scan.next().charAt(0);

        int chrFreq=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){

                chrFreq ++;
            }

        }
        System.out.println(ch + " is used " + chrFreq + " times.");
    }

}


/*
Write a program that asks user to enter a string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */