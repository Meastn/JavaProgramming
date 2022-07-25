package day30_CustomClasses;

public class Cars {
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice) {
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public void drive () {
        System.out.println(brand + " " + model + " initiated autodrive mode.");
    }

    public void start() {
        System.out.println(brand + " " + model + " started.");
    }

    public void stop (){
        System.out.println(brand + " " + model + " stopped.");
    }

    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}


// brand, model, color, year, price
// drive (), start(), stop(), toString(9, setInfo()