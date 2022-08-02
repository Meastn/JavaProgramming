package day39_Recap_Encapsulation_Inheritance.Shapes.Shapes;

import day39_Recap_Encapsulation_Inheritance.Shapes.Shapes.Shape;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Invalid side for " + getName() + " :" + side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter () {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
