package Replit;
import java.util.Scanner;
public class SumNumbers {
        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
                Scanner input = new Scanner (System.in);
                System.out.println ("Enter 3 numbers:");
                int num1 = input.nextInt();
                // System.out.print (" , ");
                int num2 = input.nextInt();
                // System.out.print (" , ");
                int num3 = input.nextInt();
                int sum = num1 + num2 + num3;
                System.out.println("Sum of numbers: " + sum);

        }
    }
