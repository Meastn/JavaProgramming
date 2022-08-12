package day42_Exceptions;

import java.util.Scanner;

public class ThrowsKeyword2 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Did I complete watching Day42? (Y/N): ");
     char status = scan.next().charAt(0);
     if (status == 'Y') {
         System.out.println("I shall rest for 2 hours (7200 seconds). Counting!!");
         for (int i = 7200; i >= 0; i--) {
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.print("\r" + i );
         }
         }else {
         System.out.println("I first have to complete watching Day42");

     }
    }
}
