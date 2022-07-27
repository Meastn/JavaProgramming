package day34_Static_Garbage_Collection;

import java.util.ArrayList;

import static day34_Static_Garbage_Collection.Circle.*;
import static Utilities.MathsUtility.sumOfTwoNumbers;
public class Test {

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        Circle circle1 = new Circle(10);
        System.out.println(circle1.radius);


        System.out.println("--------------------");
    // find the sum of 10 and 20
        // find the sum of 100 and 200
        // use sum method in MathUtility Class in another PACKAGE


        System.out.println(sumOfTwoNumbers(100.0,200.4));
        System.out.println(sumOfTwoNumbers(10,20));

        ArrayList<Integer> list = new ArrayList<>();
        Integer a=1;


        System.out.println(list.remove(a));
    }

}
