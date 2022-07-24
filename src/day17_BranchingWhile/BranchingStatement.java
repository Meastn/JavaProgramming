package day17_BranchingWhile;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {

        for (char i = 'A'; i < 'F'; i++) {

            if (i == 'C') {
                continue; // if you put if/break statement before the print statement
                // it will print E than break and will not print F

            }
            System.out.print(i + " ");


        }
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num < 0) {
                break;
            }
        }
        System.out.println("_______");
        int num2 = 0;
        for (int i = 1; i < 20; i++) {
            num2++;
            if (num2 % 2 == 0) {
                continue;
            }
            System.out.print(num2 + " ");

        }
        num2=0;
        System.out.println();
        for (int i = 1; i <= 20; i++) {
            num2++;
            if (num2 % 2 != 0) {
                continue;
            }

            System.out.print(num2 + " ");

        }
    }
}