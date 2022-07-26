package day31_CustomClass_Constructors;

public class Rectangle {
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return length*width;
    }

    public double calcPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

/*
create a custom class named Rectangle

Attributes:
length, width

Add a constructor that can set all the field

Actions:
calculateArea () : calculates the area of a rectangle, returns as double
 calculatePerimeter () : calculate the perimeter of a rectangle, retuns as double
 */