package day10_NestedIf;

import java.util.Scanner;
public class Loans {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your salary?: ");
        int salary = scan.nextInt();
        System.out.println("What is your credit score?: ");
        int creditScore = scan.nextInt();
        String result ="";
        result = (salary >= 60000 && creditScore >= 650)? "Loan Approved" : "Loan Denied";
        System.out.println("result = " + result);
            
        }
    }

/*
6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */