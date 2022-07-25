package day30_CustomClasses;

public class CarObjects {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.setInfo("Toyota", "Auris", "Black", 2012, 49000.5);
        Cars car2 = new Cars();
        car2.setInfo("Renault", "Clio", "White", 2015, 30000.34);
        Cars car3 = new Cars();
        car3.setInfo("Volkswagen", "Golf", "Grey", 2011, 55400.56);

        System.out.println(car1 + "\n" + car2  + "\n" + car3 );
    }
}
