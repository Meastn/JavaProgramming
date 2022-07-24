package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
    int n1=100, n2=120;

    boolean n1TheMinimum = n1>n2,
            n2TheMinimum = n2>n1,
            bothEqual = n1==n2;

    if (n1TheMinimum) {
        System.out.println("n1 is the minimum between two numbers: " + n1 + " - " + n2);
    }
    if (n2TheMinimum) {
        System.out.println("n2 is the minimum between two numbers: " + n1 + " - " + n2);
    }
    if (bothEqual) {
        System.out.println("Both numbers are equal which are: " + n1 + " - " + n2);
    }

    }
}

/*
Create a class called MinNumber,    write a program that can print the minimum number between two numbers
, if both are equal than print equal
Ex:
n1=100, n2=200

Output:
100 is the minimum number

Possibilities for boolean initialization
possibility #1: n1 is the minimum number
possibility #2: n2 is the minimum number
possibility #3: n1 and n2 are equal
 */