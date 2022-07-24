package day12_Scanner;

import java.util.Scanner;

public class GradeLevelMixed {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current grade level:");
        byte grade = scan.nextByte();
        String result="";

        if (grade >= 1 && grade <= 18) {
            switch (grade) {
                case 1: case 2: case 3: case 4: case 5:
                    result = "Elementary School";
                    break;
                case 6: case 7: case 8:
                    result = "Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "High School";
                    break;
                case 13: case 14: case 15:
                    result = "College";
                    break;
                default: // 16-17-18
                    result = "Grad School";
            }
        }else{
            result = "Invalid grade level given";
        }
        System.out.println(result);

    }
}

/*

Create a task called GradeLevel, given a number (byte) grade level determine and print which
school type someone is in
grade level and types:
    1-5 Elementary School
    6-8 Middle School
    9-12 High School
    13-15 College
    16-18 Grad School

    For Any Other Grade : Invalid grade level given

    Note :
    Solution 1: use switch statement
    Solution 2: use if & switch both
 */