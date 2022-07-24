package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        double[] doubleArray = {4.5, 18.6, 1.7, 21.8};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        char[] charArray = {'A', 'B', 'c'};
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

        System.out.println("------------------------------");

        System.out.println(sumOfNumbers(10,20,23,45));
        System.out.println(sumOfNumbers(2.3,5.6,4.5,7.8));

    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static double sumOfNumbers (double num1, double num2, double num3){

        return num1+num2+num3;
    }
    public static double sumOfNumbers (double num1, double num2, double num3, double num4){

        return sumOfNumbers(num1, num2, num3) + num4; // you can recall the same method to create another method within the same name
    }
}


/*
Method overloading:
multiple methods that have the same function can carry the same name.
an example is Arrays.sort method which is also an overloaded method.

Similar functionality, same name, different paremeters (different variable types or different values)
 */