package day09_IfStatements;
import java.util.Scanner;
public class PosNegZero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int n = scan.nextInt();
        scan.close();


        if (n>0) {
            System.out.println(n + " is a positive number.");
        } else if (n<0) {
            System.out.println(n + " is a negative number.");
            }else {
            System.out.println(n + " is zero.");
        }

        boolean positive =  n>0;
        boolean negative = n<0;
        System.out.println("----OTHER WAY-----");
        if (positive) {
            System.out.println(n + " is a positive number.");
        } else if (negative) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println(n + " is zero.");
        }
        System.out.println("------BUGGY SITUATION-----");
/*here there are two if statements. When you enter 100 ie. Computer will execute the first and since the result is true
it will print "100 is a positive number". But since there is a following separate if
statement it will execute it too.
It will check if 100 is a negative number it will give a false value so it will continue to
execute the else statement which will automatically execute since within this statement if 100 is not
negative than in else (other) situation it will be true and print a second line as
100 is zero. THIS IS A BUG.
 */
        if (positive){
            System.out.println(n + " is a positive number.");
        }
        if (negative) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println(n + " is zero. <---- THIS IS A REAL CODING BUG");
        }
    }
}
