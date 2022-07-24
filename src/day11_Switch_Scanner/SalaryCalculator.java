package day11_Switch_Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 75_000;
        boolean isMarried = true;
        double taxRate = 0;



        if (salary >= 13000) {
            taxRate = 0.35;
        } else if (salary >= 10000) {
            taxRate = 0.30;
        } else if (salary >=8000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried) {
            taxRate -= 0.05;}

        double salaryAfterTax = salary - (salary * taxRate);
        System.out.println("salary after tax: "+salaryAfterTax);
}
}
/*
Write a program that can calculate the salary after tax based on following requirements
the tax rates are
        35% for salary 130K or more
        30% for salary of 100k to 130 K (excluded)
        25% for salary of 80k to 100k (excluded)
        20% for salary less than 80k
        in addition if the person is married, (s)he will pay 5% less tax
 */