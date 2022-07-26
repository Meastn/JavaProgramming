package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.setInfo("Toyota", "Auris", "Black", 2007, 49000.5);
        Cars car2 = new Cars();
        car2.setInfo("Renault", "Clio", "White", 2015, 30000.34);
        Cars car3 = new Cars();
        car3.setInfo("Volkswagen", "Golf", "Grey", 2011, 55400.56);
        Cars car4 = new Cars();
        car1.setInfo("Toyota", "Corolla", "Red", 1997, 19000.5);

        System.out.println(car1 + "\n" + car2  + "\n" + car3 );
        Cars [] cars = {car1,car2,car3};
        ArrayList<Cars> carList = new ArrayList<>();

        carList.addAll (Arrays.asList(car1, car2, car3));
// ACCESSING EACH VARIABLE FOR EACH OBJECT
        for (Cars each: carList) {
            System.out.println(each.brand + " : " + each.price);
        }



        // RECALL

/*
Made a recall for the car models between these years.
You can use removeif to
first check the brand, than check if the year suits.
BMW : 2005 2008
TOYOTA : 1995-1997
 */
        carList.removeIf(p -> p.brand.equals("Renault") && p.year >= 2005 && p.year <=2008);
        carList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <=1997);
    }
}
