package day38_Inheritance.Cars;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void autoPilot (){
        System.out.println(brand + " " + " can go in auto pilot mode. ");
    }

    //OVERRIDING CAR/START

    public void start () {
        System.out.println(brand + " " + model + " : TURN THE KEY to start ");
    }
}
