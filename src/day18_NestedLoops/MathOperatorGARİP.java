package day18_NestedLoops;

import java.util.Scanner;

public class MathOperatorGARİP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        while (true) {
            System.out.print("Enter a number: ");
            num1 = scan.nextInt();
            System.out.print("Enter another number: ");
            num2 = scan.nextInt();
            System.out.print("Enter an operator: ");
            char op = scan.next().charAt(0);
            while (!((op == '+') || (op == '-') || (op == '*') || (op == '/'))) {
                System.err.print("Invalid Operator, please re-enter: ");
                op = scan.next().charAt(0);
            }
            double calc = 0;
            if ((op == '+')) {
                calc = num1 + num2;

            } else if ((op == '-')) {
                calc = num1 - num2;

            } else if ((op == '*')) {
                calc = num1 * num2;

            } else if ((op == '/')) {
                calc = num1 / num2;

            }
            System.out.println("calc = " + calc);
            System.out.print("Do you want to continue calculations?: ");
            String a = scan.next().toLowerCase();
            while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter"); // NEDEN İKİ KERE YAZIYOR BUNU
                a = scan.nextLine().toLowerCase();
            } // it stops if the answer is either ye or no

            if(a.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }


    }
}

    /*
     while(true) {


            System.out.println("Enter your first number");
            int num1 = scan.nextInt();
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Enter your math operator");
            char ch = scan.next().charAt(0);

            while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                System.err.println("Invalid Operator, please re-enter:");
                ch = scan.next().charAt(0);
            }

            double result = 0;

            if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }

            System.out.println(result);
            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            } // it stops if the answer is either ye or no

            if(a.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }


        }

       scan.close();

     */

/*
write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */