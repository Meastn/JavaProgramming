package day5_Concanetation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Melih Rüştü Çalıkoğlu",
                buildingNumber = "18",
                streetName = "İlkiz Sokak",
                cityName = "Çankaya",
                state = "Ankara",
                zipCode = "06570";

        System.out.println(name + "\n" + buildingNumber + ", " + streetName + "\n" + cityName + ", " + state + "\n" + zipCode);
    }
}
