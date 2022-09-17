package day45_Abstraction.Shapes;

public class Cylinder extends ShapeParent implements Volume {


   private final static double pi;
   private double radius;
   private double height;

   static {
       pi= 3.141592653589793238;
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

    public double getHeight() {

       return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new RuntimeException("Invalid Radius: " + height);
        }
       this.height = height;
    }

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    @Override
    public double area() {
        return 2*pi*radius*radius+height;

    }

    @Override
    public double perimeter() {
        return 4*radius + 2*height;
    }

    @Override
    public double volume() {
        return pi*radius*(2*height);
    }

    @Override
    public String toString() {
        return "Cylinder : {" +
                super.toString() +
                ", radius=" + radius +
                ", height=" + height +
                ", volume='" + volume() + '\'' +
                '}';
    }
}
