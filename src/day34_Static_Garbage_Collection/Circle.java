package day34_Static_Garbage_Collection;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name = "Circle";

    public static ArrayList<Integer> numbers;
    //numbers.add (10);

    // public static Sheet sheet


    public Circle(double radius) {
        this.radius = radius;

    }

    static {
        // radius = 5
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(12);
    }

}
