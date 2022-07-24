package day16_ForLoopStringPractices;

import java.util.Scanner;

public class FibonacciTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Times to run your Fibonacci series: ");
        int times = scan.nextInt();

        int num1 = 0, num2=1, sum=0;

        for (int i=1; i<=times; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        System.out.println(sum);


    }
}
