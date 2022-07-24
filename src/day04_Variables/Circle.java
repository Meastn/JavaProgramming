package day04_Variables;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //   requests the value of the radius to calculate circles specs
        System.out.println("\nPlease Enter the radius of the Circle:");
        double radius = scan.nextDouble();
        scan.close();

        double pi = 3.14159265359;

        double diameter = radius*2;
        double area = pi * radius * radius;
        double perimeter = diameter * pi;
        System.out.println("\n\n\t Given Radius of the circle    = " + radius + " cm");
        System.out.println("\n\t Diameter of the Circle  = " + diameter + " cm");
        System.out.println("\t Area of the circle      = " + area + " cm2");
        System.out.println("\t Perimeter of the circle = " + perimeter + " cm");

    }
}
