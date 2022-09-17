package day45_Abstraction.Shapes;

public class Square extends ShapeParent{

    private int side;


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new RuntimeException("Invalid value for side :" + side);
        }
        this.side = side;
    }

    public Square(int side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square : {" +
                super.toString() +
                "side=" + side +
                '}';
    }
}
