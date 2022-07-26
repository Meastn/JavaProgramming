package day32_CustomClass_Constructors;

public class Car {
    public String brand, model;
    public int year;
    public double price;
    public String color;

    public Car (String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }
    public Car (String brand, String model, int year){
        this (brand, model);
        this.year = year;
    }

    public Car (String brand, String model, int year, String color){
        this (brand, model, year);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
