package Replit;
import java.util.Scanner;
public class RemoveXandx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if ( word.startsWith("x") || word.startsWith("X")) {
            word = word.replace("x","");
            word = word.replace("X","");
           // String sub = word.substring(1, word.length()-1);
            System.out.println (word);
        } else if ( word.endsWith("x") || word.endsWith("X")) {
            word = word.replace("x","");
            word = word.replace("X","");
            System.out.println (word);
        } else {
            System.out.println (word);
        }

    }
}

