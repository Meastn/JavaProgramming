package day10_NestedIf;
import java.sql.SQLOutput;
import java.util.Scanner;

public class NameOfMonths {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter number of the month:");
        int numberMonth = scan.nextInt();
        String result = ""; // giving a temporary value to the variable
        String text= "It's ";
        String invalid = "Invalid ";

        if (numberMonth>=1 && numberMonth<=12) { // if the number is valid (1-12) // this if block is used only to give a value to the variable result
            if (numberMonth==1) {
                result = "January";
            } else if (numberMonth==2) {
                result = "February";
            } else if (numberMonth==2) {
                result = "February";
            } else if (numberMonth==3) {
                result = "March";
            } else if (numberMonth==4) {
                result = "April";
            } else if (numberMonth==5) {
                result = "May";
            } else if (numberMonth==6) {
                result = "June";
            } else if (numberMonth==7) {
                result = "July";
            } else if (numberMonth==8) {
                result = "August";
            } else if (numberMonth==9) {
                result = "September";
            } else if (numberMonth==10) {
                result = "October";
            } else if (numberMonth==11) {
                result = "November";
            } else  {
                result = "December";
            }
        } else { // if the number is not valid
            result = "an " +  invalid + " entry!"; // for proper syntax
        }
        System.out.println( text  + result); // this prints the defined value of result in the nested if block
    }
}
