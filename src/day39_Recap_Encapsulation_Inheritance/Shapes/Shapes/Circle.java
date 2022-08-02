package day39_Recap_Encapsulation_Inheritance.Shapes.Shapes;

public class Circle extends Shape {

    private double radius;
    public static double pi;

    static {
        pi = 3.1415926535;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Invalid radius for " + getName() + " : " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius * radius * pi;


    }

    @Override
    public double perimeter() {

        return 2 * radius * pi;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
