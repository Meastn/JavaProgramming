package day38_Inheritance.Cars;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " " + year + " breaks down easily.");
    }
    public void racing (){
        System.out.println(brand + " " + model + " " + " races super fast" );
    }

    @Override
    public void start () {
        System.out.println(brand + " " + model + "      : SAY START to start");
    }
}
