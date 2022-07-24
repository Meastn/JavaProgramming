package day5_Concanetation;

public class CarInfo {
    public static void main(String[] args) {

        String modelYear = "2012";
        String make = "Toyota";
        String model = "Auris";
        String miles = "69590";
        String color = "Black";
        String price = "10000";
        char currency = '$';

        System.out.println("Car Details :");

        System.out.println();
        System.out.println(modelYear + " " + make + " " + model + ", " + miles + " miles, " + color +", " + currency + price);

    }
}
