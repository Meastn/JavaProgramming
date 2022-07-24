package Replit;
import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int n = scan.nextInt();

        String check = str.substring(0, n);

        System.out.println("check = " + check);
        if (str.contains(check)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}

