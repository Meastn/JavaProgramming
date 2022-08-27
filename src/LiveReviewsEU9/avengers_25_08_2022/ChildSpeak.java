package LiveReviewsEU9.avengers_25_08_2022;

import java.util.Arrays;

public class ChildSpeak {
    public static void main(String[] args) {

        String word = "island";
        String[] wordArray = word.split("");

        for (int i=0; i<= 1; i++) {
            System.out.println(isConsonant(wordArray[i]));

        }

    }

    public static String isConsonant(String s) {
        String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
        String ch ="";
        int count =0;
        for (int i = 0; i < consonants.length; i++) {
            if (s.equals(consonants[i])) return s;
        }
        return ch;
    }
    public static String isVowel(String s) {
       String [] vowels = {"a", "e", "i", "o", "u","y"};
        String ch ="";
        int count =0;
        for (int i = 0; i < vowels.length; i++) {
            if (s.equals(vowels[i])) return s;
        }
        return ch;
    }


}



/*
island :
Rule 1: Turn all consonants into first consonant  // issass
Rule 2: if the first character is a vowel, then put the same first consonant at the beginning.
island : issass : sissass

 */

