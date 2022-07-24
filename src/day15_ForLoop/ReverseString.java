package day15_ForLoop;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String str = scan.nextLine();
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
        result  += str.charAt(i); // adding each character to the result

        }
        System.out.println("result = " + result);
        System.out.println("----------------");
        String result2="";
        for (int ii= 4;  ii>=0; ii --) {
            result2 += str.charAt(ii);
        }
    }
}

/*
Write a program that can reverse any given String

 */