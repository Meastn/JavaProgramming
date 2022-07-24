package day09_IfStatements;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number please: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter the second number please: ");
        int secondNumber = scan.nextInt();
        scan.close();
        System.out.println("------RESULTS--------");
        if (firstNumber>secondNumber){
            System.out.println(firstNumber + " is the bigger number.");
        } else {
            System.out.println(secondNumber + " is the bigger number.");
        }

        if (firstNumber<secondNumber){
            System.out.println(firstNumber + " is the smaller number.");
        } else {
            System.out.println(secondNumber + " is the smaller number.");
        }
    }


}
