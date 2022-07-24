package day10_NestedIf;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your grade (A-F): ");
        char grade = scan.next().charAt(0);
        String result="";
        
        
        if (grade >= 'A' && grade <= 'F' || grade >= 'a' && grade <= 'f') {
            result = (grade == 'A' || grade == 'a')? "excellent" :(grade == 'B' || grade == 'b')? "great job" :(grade == 'C'|| grade == 'c')? "good"
                    :(grade == 'D' || grade == 'd')? "passed" :"failed";
        } else {
            result = "invalid";
        }

        System.out.println("result = " + result);
        
        
    }
}
/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */