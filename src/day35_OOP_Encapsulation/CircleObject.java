package day35_OOP_Encapsulation;

public class CircleObject {

    public static void main(String[] args) {

        Circle c1 = new Circle(4);
        Circle c2 = new Circle(5);
        System.out.println(c1);
        c1.calcArea();
        c2.calcArea();
        System.out.println("-----");
        c1.calcPerimeter();
        c2.calcPerimeter();

    }
}
