package day10_NestedIf;
import java.util.Scanner;
public class BiggerNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number (n1): ");
        int n1= scan.nextInt();
        System.out.println("Enter a number (n2): ");
        int n2= scan.nextInt();
        System.out.println("Enter a number (n3): ");
        int n3= scan.nextInt();
        String result ="";
        result = (n1>n2 && n1>n3)? "n1 is the bigger" :(n2>n1 && n2>n3)? "n2 is the bigger" : "n3 is the bigger";
        System.out.println("result = " + result);
    }
}

/*
 Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

 */