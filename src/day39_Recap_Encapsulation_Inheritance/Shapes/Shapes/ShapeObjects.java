package day39_Recap_Encapsulation_Inheritance.Shapes.Shapes;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle c1 = new Circle(" ", 4);
        Rectangle r1= new Rectangle("Dikdörtgen",3.6,4.7);
        Square s1 = new Square("Kare", 4.7);
        System.out.println("---CIRCLES----");

        System.out.print(c1.getName() + " area               = " );
        c1.area();
        System.out.print(c1.getName() + " perimeter          = " );
        c1.perimeter();
        System.out.println("---RECTANGLES----");
        System.out.print(r1.getName() + " area          = " );
        r1.area();
        System.out.print(r1.getName() + " perimeter     = " );
        r1.perimeter();

        System.out.println("---SQUARES----");
        System.out.print(s1.getName() + " area                = " );
        s1.area();
        System.out.print(s1.getName() + " perimeter           = " );
        s1.perimeter();

    }
}
