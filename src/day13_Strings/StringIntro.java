package day13_Strings;
import java.lang.String; // lang subpackage of java is special. You don't have to import it before using. It is implicitly imported beforehand.
import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {
        String name = "Java";
        String name2 = "Java";
        String name3 = "Java";
        String name4 = "Java";

        System.out.println( name == name2);// true because they refer to the same object (Java) in the heap memory String Pool
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);
        System.out.println("-----------------------------------");

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Java");

        System.out.println(str1 == str2); // return false since new keyword creates different objects even they carry the same value and it is not created
        // in the string pool although being created in the HEAP memory
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println("-----------------------------------");
        System.out.println(str1.equals(str2)); // if you want to compare not the objects themselves
        // but the text they contain you shall always use .equals method
        System.out.println("-----------------------------------");
        System.out.println(name3.equals(str4)); // ,equals is the only way to compare the string
        //within a String literal and a string object created by new keyword
    }





}
