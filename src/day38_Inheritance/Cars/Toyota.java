package day38_Inheritance.Cars;

public class Toyota extends Car{
    public Toyota(String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }
    public void autoPilot (){
        System.out.println(brand + " " + " can go in auto pilot mode. ");
    }

    //OVERRIDING CAR/START

    public void start () {
        System.out.println(brand + " " + model + " : TURN THE KEY to start ");
    }
}
