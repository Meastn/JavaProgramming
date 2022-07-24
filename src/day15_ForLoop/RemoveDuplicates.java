package day15_ForLoop;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a text to determine its characters: ");
        String word = scan.nextLine();
        String result ="";
        word = word.toUpperCase();

        for (int i= 0; i < word.length(); i++) {
            String ch = "" + word.charAt(i);
            System.out.print (ch);
            if (!result.contains(ch)) {
                result += ch;
            }

        } System.out.println("\nDropping duplicates = " + result);


    }
}
