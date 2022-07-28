package day37_Inheritance.PhoneTask;

public class iPhone extends Phone{
    public boolean hasFaceID;
    public iPhone(String model, double size, double price, String color, boolean hasFaceID) {
        super("Apple", model, size, price, color);
        this.hasFaceID = hasFaceID;
    }

    public void facetime (long phoneNumber){
        System.out.println(brand + " " + model + " is having a face time with " + phoneNumber);
    }

    public void facetime (String email){
        System.out.println(brand + " " + model + " is having a face time with " + email);
    }


    @Override
    public String toString() {
        return "iPhone{" +
                "hasFaceID=" + hasFaceID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
