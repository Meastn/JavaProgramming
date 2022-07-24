package day16_ForLoopStringPractices;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a word/sentence to check if it as Palindrome: ");
        String word = scan.nextLine();
        String reversed = "";

        for (int i=word.length()-1; i >=0; i --) {
            reversed += word.charAt(i);
        }
        System.out.println("If there is a palindrome: " + reversed.equalsIgnoreCase(word));
        }

    }

