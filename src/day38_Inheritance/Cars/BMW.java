package day38_Inheritance.Cars;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW",model, year, price, color, miles);

    }

    public void reliable (){
        System.out.println(brand + " is a reliable brand.");
    }

    @Override
    public void start() {
        // super.start();
        System.out.println(brand + " " + model + "       : KICK to start");
    }
}
