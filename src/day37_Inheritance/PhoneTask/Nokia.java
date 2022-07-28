package day37_Inheritance.PhoneTask;

public class Nokia extends Phone {


    public Nokia(String model, double size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefence (){
        System.out.println(brand + " " + model + " is used for self defence ");
    }
}
