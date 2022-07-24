package day11_Switch_Scanner;
import java.util.Scanner;
public class ConvertNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a single digit number: ");
        int n= scan.nextInt();
        String text="";

            text = (n>=0 && n<=9)?
                    (n==0)? "Zero" :(n==1)? "One" :(n==2)? "Two": (n==3)? "Three"
                    : (n==4)? "Four" : (n==5)? "Five" : (n==6)? "Six" : (n==7)? "Seven"
                    : (n==8)? "Eight" : "Nine":"Invalid Entry. A single digit number is required.";

        System.out.println("Your number is = " + text);
    }
}
