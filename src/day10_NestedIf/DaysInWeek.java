package day10_NestedIf;
import java.util.Scanner;
public class DaysInWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number of day in a week (1-7):");
        int day = scan.nextInt();
        String result = "";

        if (day >= 1 && day <= 7) {
            result = (day==1)? "Monday" :(day==2)? "Tuesday" :(day==3)? "Wednesday" :(day==4)? "Thursday" :(day==5)? "Friday" :(day==6)? "Saturday" : "Sunday";
        } else {
            result = "Invalid Entry";
        }
        System.out.println(result);


    }
}
