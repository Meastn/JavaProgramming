package day32_CustomClass_Constructors;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Audi", "A6");
        Car car3= new Car("BMW", "i3", 2009);
        Car  car4= new Car("Mercedes", "EQ5", 2019, "Blue");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
