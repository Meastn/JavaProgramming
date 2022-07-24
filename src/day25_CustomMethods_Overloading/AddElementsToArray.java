package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        System.out.println("------Add Element to Integer Array-------");
        int [] intArray = {19,45,2,24};
        intArray = addElement(intArray,100);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("------Add Element to Decimal Array-------");
        double [] doubleArray = {111.2,43.7,99.3,51.7};
        doubleArray = addElement(doubleArray, 111.1);
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("------Add Element to String Array-------");
        String [] stringArray = {"hello", "this", "is", "not"};
        stringArray = addElement(stringArray, "fair");
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        System.out.println("------Add Element to Character Array-------");
        char [] charArray ={'B','A','E','B', 'Ç'};
        charArray = addElement(charArray, 'Z');
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));
    }


    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element; // assign the last element of the new Array which is +1 more than the source Array
        return result;
    }

    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        // result [result.length-1] = element de olabilir
        return result;
    }
}
