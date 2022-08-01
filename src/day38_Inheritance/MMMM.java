package day38_Inheritance;

public class MMMM {
    
    public String brand, model,color;
    public int year, miles;
    public double price;

    public MMMM(String brand, String model, String color, int year, int miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }
    
    public void start () {
        System.out.println(brand + model + " has started.");
    }
    
    public void drive () {
        System.out.println(brand + model + " has driven " + miles + " miles.");
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
