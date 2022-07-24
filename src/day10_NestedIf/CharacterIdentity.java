package day10_NestedIf;
import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {
        Scanner scan = new  Scanner (System.in);
        System.out.println("Enter a character to identify its type: ");
        char ch = scan.next().charAt(0);

        String result = (ch>='0' && ch<='9')? "Numerical" :((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))? "Alphabetical" : "Special Character";

        System.out.println( ch + " is a " + result);
    }
}
