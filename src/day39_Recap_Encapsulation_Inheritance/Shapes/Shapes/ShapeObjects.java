package day39_Recap_Encapsulation_Inheritance.Shapes.Shapes;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle c1 = new Circle( 6);



        System.out.println("---CIRCLE----");
        System.out.println(c1);
        System.out.println(c1.getName() + " area                = "+ c1.area() );
        System.out.println (c1.getName() + " perimeter           = " + c1.perimeter());
        System.out.println();

        System.out.println("---RECTANGLE----");
        Rectangle r1= new Rectangle(6,5);
        System.out.println(r1);
        System.out.println(r1.getName() + " area             = " +r1.area() );
        System.out.println(r1.getName() + " perimeter        = " + r1.perimeter() );
        System.out.println();

        System.out.println("---SQUARE----");
        Square s1 = new Square( 5);
        System.out.println(s1);
        System.out.println(s1.getName() + " area                = " + s1.area() );
        System.out.println(s1.getName() + " perimeter           = " +  s1.perimeter() );



    }
}
