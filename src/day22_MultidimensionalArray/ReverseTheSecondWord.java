package day22_MultidimensionalArray;

import java.util.Scanner;

public class ReverseTheSecondWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a sentence: ");
        String str = scan.nextLine();
        String [] split = str.split(" ");
        System.out.println("Your sentence has " + (split.length-1) + " words.");
        System.out.println("Enter the index number of the word to reverse:");
        int change = scan.nextInt();
        String word = split[change];
        String reverse ="";
        String reversedResult="";

        for (int i = split[change].length()-1; i >=0 ; i--) {
            reverse += split[change].charAt(i);

        }

        System.out.println("selected word reversed = " + reverse);
        // FIRST SOLUTION WITH REPLACEFIRST
        // System.out.println("Sentence with reversed word = " + str.replaceFirst(split[change],reverse));
        // SECOND SOLUTION with FOREACH
        split[change] = reverse;
        for (String each: split){
            System.out.print(each + " ");
              {

        }

        }
    }
}


/*
Write a program that can reverse the second
word of the sentence.,
Ex:
sentence = " I love Java"
Out:
I evol Java
 */