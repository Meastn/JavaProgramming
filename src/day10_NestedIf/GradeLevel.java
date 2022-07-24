package day10_NestedIf;
import java.util.Scanner;
public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your latest grade level: ");
        byte grade = scan.nextByte();
        String schoolType= "";
        String resultStart= "Your latest graduation is  ";

        if (grade>=1 && grade<=18){

            schoolType = (grade >= 1 && grade <=5)? "Elementary school" :(grade >= 6 && grade <=8)? "Middle school"
                    :(grade >= 9 && grade <=12)? "High School":(grade >= 13 && grade <=16)? "College" : "Grad School";

        } else {
            schoolType = "invalid!";
        }

        System.out.print( resultStart + schoolType);
    }
}


/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */