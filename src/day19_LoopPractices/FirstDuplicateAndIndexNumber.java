package day19_LoopPractices;

public class FirstDuplicateAndIndexNumber {
    public static void main(String[] args) {
        String str ="print the confirmed duplicate char";

        for (int i = 0; i <str.length()-1; i++) {
            char ch = str.charAt(i); // get the value of the next char

            for (int j = 0; j < str.length(); j++) {
                String rest = str.substring(i + 1, str.length()); // create a container for the remaining string
                // and delete the first received character from the remaining string

                if (rest.contains("" + ch)) { // check if the remaining string contains the ch at hand
                    System.out.println(ch); // print the confirmed duplicate char
                    int index = str.indexOf(ch);
                    System.out.println(index);
                    System.exit(0); // quit the loop before repeating
                }

            }
        }

    }
}

/*
1. Write a program that can return the first duplicated character
from a string
 */