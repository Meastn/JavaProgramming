package day09_IfStatements;

import java.util.Scanner;
public class MedianNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for A:");
        int a = scan.nextInt();
        System.out.println("Enter a value for B:");
        int b= scan.nextInt();
        System.out.println("Enter a value for C:");
        int c= scan.nextInt();
        scan.close();

            // a=15, b=10, c=20,   || a=15, b=20, c=10
        boolean aIsMedian= (a>b && a<c) || (a>c && a<b);
            // b=15, a=10, c=20    || b=15, a=20, c=10
        boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
        // c=15, a=10, b=20   || c=15, a=20, b=10
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        /*
        In order for a to be the median number it has to be bigger than one of the numbers and smaller than the other
        This can change. For example
        - in one condition b can be the biggest number and c can be the smallest number while
        - in another condition c can be the biggest number and b can be the smallest number
         */
        if (aIsMedian){
            System.out.println("A is the Median Number  = " + aIsMedian);
        }
         /*
        In order for b to be the median number it has to be bigger than one of the numbers and smaller than the other
        This can change. For example
        - in one condition a can be the biggest number and c can be the smallest number while
        - in another condition a can be the biggest number and c can be the smallest number
         */
        if (bIsMedian){
            System.out.println("B is the Median Number = " + bIsMedian);
        }
         /*
        In order for c to be the median number it has to be bigger than one of the numbers and smaller than the other
        This can change. For example
        - in one condition b can be the biggest number and a can be the smallest number while
        - in another condition a can be the biggest number and b can be the smallest number
         */
        if (cIsMedian){
            System.out.println("C is the Median Number = " + cIsMedian);
        }

    }
}

/*

 */