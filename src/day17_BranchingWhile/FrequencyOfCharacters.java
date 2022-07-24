package day17_BranchingWhile;
import java.util.Scanner;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a series of random characters w/o spaces (bigger case):");
        String entry= scan.next();
        System.out.println("Write the character to be checked how many times it repeats:");
        char ch = scan.next().charAt(0);

        int freq =0; // how many times ch repeats

        for (int i = 0; i < entry.length(); i++) {

            char eachChar = entry.charAt(i);

            if (ch == eachChar) {

                freq ++;
            }


        }System.out.println(ch + " is repeated " + freq+ " times.");

    }
}
