package day11_Switch_Scanner;
import java.util.Scanner;
public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = scan.nextInt();
        System.out.println("Enter the month :");
        int month = scan.nextInt();
        System.out.println("================");
        String result = "";

        if (month >= 1 && month <= 12) {
            switch (month) { // emulating OR statement, with declaring cases back to back (without statements) until an active statement
                // in this case, case 12, case 4 and default
                case 2:
                    /*if (year % 4 ==0) {
                        result = "29 days";
                    } else {
                    result = "28 days";}

                     */
                    result = (year%4==0)? "29 days" : "28 Days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;
                default: // 1, 3, 5, 7, 8, 10, 12
                    result = "31 days";
            }

        } else {
            result = "Invalid Entry";
        }
        System.out.println("result = " + result);
    }

}
