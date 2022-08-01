package day38_Inheritance.Cars;

public class BMW extends Car{

    public BMW(String brand, String model, String color, int year, int miles, double price) {
        super(brand, model, color, year, miles, price);
    }


    public void reliable (){
        System.out.println(brand + " is a reliable brand.");
    }
}
