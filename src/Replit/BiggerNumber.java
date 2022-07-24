package Replit;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        //your code here
        if (n1 > n2 && n1 > n3) {
            System.out.println("n1 is bigger");
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("n2 is bigger");
        }
        if (n3 > n2 && n3 > n1) {
            System.out.println("n3 is bigger");
        }

    }
}
