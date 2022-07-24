package Replit;
import java.util.Scanner;

public class LastCharacter {
        public static void main(String[] args) {
            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE
            int ch = word.length() -1;
            System.out.println(word.charAt(ch));

            scan.close();
        }
    }

