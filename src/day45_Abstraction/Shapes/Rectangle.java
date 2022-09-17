package day45_Abstraction.Shapes;

public class Rectangle extends ShapeParent{
    private int height;
    private int width;

    public Rectangle( int height, int width) {
        super("Rectangle");
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height<=0) {
            throw new RuntimeException("Invalid value for " + getName());
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0) {
            throw new RuntimeException("Invalid value for " + getName());
        }
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return  2*(width + height);
    }

    @Override
    public String toString() {
        return "Rectangle : {" +
                super.toString() +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
