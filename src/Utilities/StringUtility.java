package Utilities;

import java.util.Arrays;

public class StringUtility {


    // this method prints each character in a String
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ", ");

        }

    }

    // reverses the characters in a given String using Arrays and returns and Uppercases the first character of the new sentence
    // and adds a dot at the and of the sentence.
    public static String reverseAndMakeSentence(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        result = result.toLowerCase();
        // converts String to char Array for text manipulation
        char[] charArray = result.toCharArray();
        // replaces the first character of the String to Upper case to form a regular sentence

        charArray[0] -= 32;

        // creates a new Array to add a . to the end of the sentence.
        char[] newcharArray = new char[charArray.length + 1];
        newcharArray[newcharArray.length - 1] = '.';
        // adds each character in the Array into the String one by one to form a new sentenci
        result = String.valueOf(charArray);
        result += String.valueOf(newcharArray);

        return result;
    }

    // reverses the characters of a given String and returns the new String
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;

    }

    // checks if the given String is a palindrome and returns a boolean result
    public static boolean isPalindrome(String str) {
        return reverseString(str).equalsIgnoreCase(str);


    }

    // checks if the given two Strings are anagram and returns a boolean result
    public static boolean anagram(String str1, String str2) { // "a,c,b", "b,a,c"
        str1.toLowerCase(); str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);

    }

    // removes the duplicates from a given String , returns String.   "aaabbbbcccc" -> "abc"
    public static String removeDuplicates (String str) {
        String result ="";
        for (int i = 0; i < str.length() ; i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)) {
                result += each;
            }

        }
        return result;
    }

}
