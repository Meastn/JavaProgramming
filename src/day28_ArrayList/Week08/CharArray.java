package day28_ArrayList.Week08;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};

        for (char letter : letters) {
            System.out.print(letter + " ");

        }
        System.out.println();
        // string is a sequence of chars
        // but we can combine chars with a single line of code

        String sentence = new String (letters); // this line turns char sequence into a string
        System.out.println("sentence: " + sentence);

        // converting string to char (IMPORTANT)
        System.out.println();
        char [] newLetters = sentence.toCharArray(); // in automation or in examples we will use this a lot
        for (char newLetter : newLetters) {
            System.out.print(newLetter + " " );
        }

        /*
        find the frequency of chars in a   String.
        */

        String str = "aaabbcdddffggiklmm";

        String result="";
        char [] arr = str.toCharArray();
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            char ch= arr [i];
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (ch == arr[j]) {
                    count ++;
                }

            }
            if (result.contains(""+ ch)){
                continue; // if my result string object contains ch char, go to beginning of loop and skip
            }
            result += ch;
            result+= count + " ";

        }
        System.out.println(result);


    }
}
