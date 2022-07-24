package day10_NestedIf;
import java.util.Scanner;
public class AgeGroups {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        String result="";
        
        if (age >= 1 && age <= 150) {
            result = (age <= 21)? "Teenager" :(age >= 22 && age <=55)? "Adult" : "Senior";
        } else {
            result = "invalid";
        }
        System.out.println("result = " + result);
    }
}


/*
 Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )    
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */