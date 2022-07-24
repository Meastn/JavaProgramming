package day10_NestedIf;
import java.util.Scanner;
public class NameofMonth2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter number of the month:");
        int month = scan.nextInt();
        String result ="";

        if (month >= 1 && month<=12) {
            result = (month==1) ? "January" :(month==2)? "February" :(month==3)? "March" // Paranthesis are not require in Terniaries
                    // but to keep it readable it is strongly recommended to write it with parathesis
                    :(month==4)? "April" :(month==5)? "May"
                    :(month==6)? "June" :(month==7)? "July"
                    :(month==8)? "August" :(month==9)? "September" :(month==10)? "October"
                    :(month==11)? "November" : "December";
        } else {
            result = "Invalid entry";
        }
        System.out.println("Name of the Month  : " + result);
        System.out.println("===============");
        String result2 = (month >= 1 && month<=12)? (month==1) ? "January" :(month==2)? "February" :(month==3)? "March"
                :(month==4)? "April" :(month==5)? "May"
                :(month==6)? "June" :(month==7)? "July"
                :(month==8)? "August" :(month==9)? "September" :(month==10)? "October"
                :(month==11)? "November" : "December" : "Not Valid";

        System.out.println("Terniary calculated result = " + result2);
    }
}
