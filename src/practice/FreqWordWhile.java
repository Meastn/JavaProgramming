package practice;

import java.util.Scanner;

public class FreqWordWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Paste the text to count the given word: ");
        String str = scan.nextLine();

        System.out.println("Enter the word to be counted within the text: ");
        System.out.println();
        String word = scan.next();


        int frequency=0;

        while (str.contains(word.substring(0,word.length()))) {
            str= str.replaceFirst(word, "");
            frequency ++;
        }
        System.out.println(frequency);
    }
}
