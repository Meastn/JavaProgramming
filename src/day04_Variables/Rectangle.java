package day04_Variables;

public class Rectangle {
    // write a program that can calculate area and perimeter of a rectangle
    public static void main (String[] args){

        double length = 12;
        double width = 6;
        double area = length * width;
        double perimeter = length * 2 + width* 2;

        System.out.print("Area of the Rectangle      = ");
        System.out.format("%.03f", area);
        System.out.println();
        System.out.print("Perimeter of the Rectangle = ");
        System.out.format("%.03f", perimeter);


    }
}
