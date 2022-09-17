package day38_Inheritance.Cars;

public class Tesla extends Car{
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
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
