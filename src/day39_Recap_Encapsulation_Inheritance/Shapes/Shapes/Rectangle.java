package day39_Recap_Encapsulation_Inheritance.Shapes.Shapes;

public class Rectangle extends Shape {

    public double l, w;

    public Rectangle(String name, double l, double w) {
        super(name);
        this.l = l;
        this.w = w;
    }

    public double area () {
        double area = l*w;
        System.out.println(area);
        return area;
    }

    public double perimeter () {
        double perimeter = 2 * (l+w);
        System.out.println(perimeter);
        return perimeter;
    }

}
