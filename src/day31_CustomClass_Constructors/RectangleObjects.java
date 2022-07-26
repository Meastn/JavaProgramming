package day31_CustomClass_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(10.6,6.7);
        Rectangle rec2 = new Rectangle(3.4, 16.7);

        System.out.println("Area of rectangle = "+ rec1.calcArea() );
        System.out.println("Perimeter of rectangle = " + rec1.calcPerimeter());

        System.out.println(rec1);
        System.out.println(rec2);

    }
}
