package day38_Inheritance.Cars;

public class Car {

    public String brand, model,color;
    public int year, miles;
    public double price;

    public Car( String brand, String model, int year, double price,  String color,  int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;

    }

    public void start () {  // WE ARE GOING TO OVERRIDE THIS METHOD
        System.out.println(brand + " "+  model + " is starting.");
    }

    public void drive () {
        System.out.println(brand + " "+  model + " has driven " + miles + " miles.");
    }

    public String toString() {
        return "Car{" +
                 "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
