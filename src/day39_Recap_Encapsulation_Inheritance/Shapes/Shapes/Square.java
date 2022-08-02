package day39_Recap_Encapsulation_Inheritance.Shapes.Shapes;

import day39_Recap_Encapsulation_Inheritance.Shapes.Shapes.Shape;

public class Square extends Shape {

    public double s;

    public Square(String name, double s) {
        super(name);
        this.s = s;
    }

    @Override
    public double area() {
        double area = s*s;
        System.out.println(area);
        return  area;
    }

    public double perimeter () {
        double perimeter = s*4;
        System.out.println(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
