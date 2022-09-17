package day45_Abstraction.Shapes;

public class Cube extends ShapeParent implements Volume{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Cube( double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double area() {
        return 6*(side*side);
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube : {" +
                super.toString() +
                ", side=" + side +
                '}';
    }
}
