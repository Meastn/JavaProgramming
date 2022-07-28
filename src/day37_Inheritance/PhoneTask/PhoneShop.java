package day37_Inheritance.PhoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Nokia nokia1 = new Nokia("Z13", 5.5,399,"black");
        iPhone iphone1 = new iPhone("12 Max", 6.6, 1200, "white", true);
        iPhone iphone2 = new iPhone("8 Plus", 6.0, 900, "rosegold", false);
        Samsung samsung1 = new Samsung ("M12", 6.6, 299, "blue");

        System.out.println(nokia1);
        System.out.println("iphone1 = " + iphone1 + "has battery = " + Phone.hasBattery);
        System.out.println("iphone2 = " + iphone2);
        System.out.println("samsung1 = " + samsung1);

        iphone1.facetime("jackjock@plops.com");
        iphone2.facetime(3211243);

        System.out.println("-----------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Nokia.hasBattery);
    }
}
