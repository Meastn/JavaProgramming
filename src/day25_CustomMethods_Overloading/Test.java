package day25_CustomMethods_Overloading;

import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "abbA";

       boolean palindrome = StringUtility.isPalindrome(str);
        System.out.println("Is "+ str + " a palindrome word: " + palindrome);

        String str1="aabbbuuukttaabrnngd";
        String nonDup = StringUtility.removeDuplicates(str1);
        System.out.println("Duplicates Removed:" + nonDup);
    }
}
