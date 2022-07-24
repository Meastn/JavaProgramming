
package practice;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Remaining Minutes:");
        int minutes = scan.nextInt();
        scan.close();

        for (int i = minutes; i > 0; --i) {
            if (i < 0) {
                break;
            }
            for (int z = 59; z >= 0; --z) {
                System.out.print("\r"+ (i-1)+" minutes and "+z+" seconds left");
                Thread.sleep(minutes=1000);
            }
        }
        System.out.println();
        System.out.println();
        System.err.println("*************************************");
        System.err.println("*                                   *");
        System.err.println("*   Times is up! Take Your Seats!   *");
        System.err.println("*                                   *");
        System.err.println("*************************************");
    }

}
