package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Collections;

public class ExtractSpecialCharacters {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList <Character> letters = new ArrayList<>(chars);

        System.out.println("letters = " + letters);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println(letters);
        System.out.println("Does letters matters?");
        }

        

    }


/*
Write a program that can extract the special characters, digits and letters from a string and
stores them into separate ArrayLists for chars, numbers and special characters

Ex :
str = "ABCD123$%#@&456EFG!"

output :
list1 : {1,2,3,4,5,6}
list2 : {A,B,C,D,E,F,G}
list3 = {$%#@&!}
 */