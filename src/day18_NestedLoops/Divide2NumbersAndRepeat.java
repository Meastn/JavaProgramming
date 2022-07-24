package day18_NestedLoops;

import java.util.Scanner;

public class Divide2NumbersAndRepeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String repeat = "";
        int num1 = 0;
        int remain = 0;
        int count = 0;
        int num2 = 0;
        int divided = 0;

        while (true){
            System.out.print("Enter a number to divide: ");
            divided = scan.nextInt();
            System.out.print("Enter a number to divide with: ");
            num2 = scan.nextInt();

            num1 = divided;
            while (divided >= num2) {
                divided -= num2;
                count++;
                remain = divided - num2;
                if (remain < 0) {
                    remain += num2;
                }

            }
            System.out.println(num1 + " divided by " + num2 + " = " + count);
            System.out.println("remain = " + remain);

            System.err.println("Wanna make a new calculation?");
            repeat = scan.next();
            if (repeat.equals("no") || repeat.equals("No")){
                System.out.println("End of process");
                break;
            }
        }


    }

}

/*
Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.

 */

