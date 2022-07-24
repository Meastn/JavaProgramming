package Replit;
import java.util.Scanner;
public class Clock {


    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds.");
        int inputSeconds = scan.nextInt();
        int hours = (int) inputSeconds / 3600;
        int minutes = (int) (inputSeconds - (hours*3600)) / 60;
        int seconds = ((inputSeconds - (hours*3600)) % 60) % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and  " + seconds + " seconds");
    }
}
