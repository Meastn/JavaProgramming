package practice;

import java.util.Scanner;

public class WordFreq {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Paste the text to count the given word: ");
        String str = scan.nextLine();

        System.out.println("Enter the word to be counted within the text: ");
        System.out.println();
        String word = scan.next();
        int frequency=0;
        int countWords=0;
        char space = ' ';

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)==space) {
                countWords ++;
            }
        }

        for (int i = 0; i < str.length()-word.length() ; i++) {

            String eachword = str.substring(i, i+word.length());
            if (eachword.equalsIgnoreCase(word)){
                frequency ++;
            }


        }
        System.out.println("There are " + (countWords+1) + " words within the text.");
        System.out.println("\"" + word + "\" repeats (" + frequency + ") times within the text");
    }
}
