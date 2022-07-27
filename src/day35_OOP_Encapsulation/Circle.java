package day35_OOP_Encapsulation;

public class Circle {

    private int radius;
    public static double pi=3.14159265359;

    public int getRadius(){
        return radius;
    }

    public void setRadius (int radius){
        if (radius <=0) {
            System.out.println("Invalid entry");
            return;
        }
        this.radius = radius;
    }

    public Circle(int radius) {
        setRadius(radius);
    }

    public void calcArea(){
        System.out.println("Area of the circle is = " + (radius*radius)*pi);
    }
    public void calcPerimeter(){
        System.out.println("Perimeter of the circle is = " + 2*radius*pi );
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +

                '}';
    }
}


/*
Create a class called CIRCLE
Private Variables:
radius
Public variables:
pi

encapsulate all the private fields
    1. radius can not be 0 or less than 0

Add a constructor that can set the radius of the circle
when circle object is created

methods
calcArea()
calcPerimeter()
toString()

 */