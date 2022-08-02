package day39_Recap_Encapsulation_Inheritance.Shapes.Shapes;

public class Circle extends Shape {

    public double r;
    private static double pi;

    static {
        pi = 3.14;
    }

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public double area() {
        double area = r * r * pi;
        System.out.println(area);
        return area;

    }

    public double perimeter () {
        double perimeter = 2 * r * pi;
        System.out.println(perimeter);
        return perimeter;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", pi=" + pi +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
