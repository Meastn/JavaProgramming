package day10_NestedIf;
import java.util.Scanner;

public class CreateReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter your exam score:");
        int score = scan.nextInt();
        String result ="";

        /*
        90 -100 : excellent
        80-89 : great
        70-79 : good
        60-69: passed
        0-59: failed
         */
        if (score>=0 && score <=100){
            // 5 possible conditions
            if (score > 90) {
                result = "Your score is excellent.";
            } else if (score > 80) {
                result ="Your score is great";
            } else if (score > 70) {
                result ="Your score is good";
            } else if (score > 60) {
                result ="Your score is passed";
            } else {
                result ="You have failed.";
            }
        } else {
            result = "Invalid entry";
        }
        System.out.println( result);

    }
}
