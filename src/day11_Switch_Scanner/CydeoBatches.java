package day11_Switch_Scanner;

import java.util.Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your batch type:");
        System.out.println("1) Us morning");
        System.out.println("2) US evening");
        System.out.println("3) EU");
        int batches = scan.nextInt();
        String result = "";


        if (batches >= 1 && batches <= 3) {
            switch (batches) {
                case 1:
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case 2:
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        } else {
            result = "Invalid Batch";
        }
        System.out.println(result);
    }
        /* SOLUTION 2
        switch (batches){

            case 1:
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case 2:
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case 3:
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result = "Invalid Batch";
        }
        System.out.println(result);
*/

        /* SOLUTION 1:
        if (batches>=1 && batches <=3) {
            if (batches == 1) {
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            } else if (batches ==2) {
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            } else {
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
            }
        } else {
            System.out.println("Invalid Batch");
        } */

}


/*
 Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */