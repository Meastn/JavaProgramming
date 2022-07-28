package day37_Inheritance.PhoneTask;

public class Phone {

    public String brand ;
    public String model;
    public double size;
    public double price;
    public String color;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, double size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        // hasBattery =true; dont call static variables from within a constructor because it can be used multiple times while
        // statics will be run once
    }

    public void call (long phoneNumber){
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text (long phoneNumber){
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                "model='" + model + '\'' +
                ", size=" + size +
                ", price= $ " + price +
                ", color='" + color + '\'' +
                ", has Battery='" + hasBattery + '\'' +
                '}';
    }
}
