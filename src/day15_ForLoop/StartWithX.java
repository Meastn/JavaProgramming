package day15_ForLoop;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String word = new Scanner (System.in).nextLine();



        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");
            System.out.println("new word = " + word);
        } else if (word.charAt(0) == 'X') {
            word = word.replaceFirst("X", "A");
            System.out.println("new word = " + word);
        } else {
            System.out.println(word + " does not start with an x or X");
        }

        String result = word.replace("a","z");
        System.out.println("result = " + result);
    }
}

/*
Write a program that asks the user to enter a word. If the word starts with x, replace it with a .

Input:
xcodex
Output:
acodex
 */