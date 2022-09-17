package day45_Abstraction.Shapes;

public class Circle extends ShapeParent {

    private double radius;
    private final static double pi;

    static {
        pi = 3.141592653589793238;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Invalid Radius: " + radius);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle : {" +
                super.toString() +
                ", radius=" + radius +
                '}';
    }
}
