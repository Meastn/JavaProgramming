package day04_Variables;

public class Square {
// write a program that can calculate area and perimeter of a square
    public static void main (String[] args){

        double side = 12.3;
        double area = side * side;
        double perimeter = side * 4;

        System.out.print("Area of the Square        = ");
        System.out.format("%.03f", area);
        System.out.println();
        System.out.println("Perimeter of the Square   = " + perimeter);


    }
}
