package day38_Inheritance.Cars;

public class CarRace {
    public static void main(String[] args) {

        BMW car1 = new BMW("z3", "red", 2009, 102000, 39000.00);
        Toyota car2 = new Toyota("Auris", "Black", 2007, 144000, 21000.00);
        Tesla car3 = new Tesla("Y", "white", 2017, 32000, 34000.00);

        System.out.println("car3 = " + car3);
        System.out.println("car2 = " + car2);
        System.out.println("car1 = " + car1);

        car1.start();
        car2.start();
        car3.start();

    }

}
