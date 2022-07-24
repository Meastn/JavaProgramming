package Replit;

import java.util.Scanner;

public class NumberOfHis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 1;
        str.toLowerCase();

        //for (int i = 0; i <= str.length(); i++) {

            while (str.contains("hi")) {
                str= str.substring(0, str.indexOf("hi"));
                //str = str.replace("hi", "");
                //str= str.substring(str.indexOf("hi"), str.length()-1);
                System.out.print("str = " + str);
                count++;
            }


        System.out.print(" " + count);

    }
}

/*
Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2
 */