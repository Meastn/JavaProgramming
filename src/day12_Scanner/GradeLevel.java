package day12_Scanner;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current grade level:");
        byte grade = scan.nextByte();

        switch (grade) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Elementary School");
                break;
            case 6: case 7: case 8:
                System.out.println("Middle School");
                break;
            case 9: case 10: case 11: case 12:
                System.out.println("High School");
                break;
            case 13: case 14: case 15:
                System.out.println("College");
                break;
            case 16: case 17: case 18:
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Invalid grade level given");
        }

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
    17-18 Grad School

    For Any Other Grade : Invalid grade level given

    Note :
    Solution 1: use switch statement
    Solution 2: use if & switch both
 */