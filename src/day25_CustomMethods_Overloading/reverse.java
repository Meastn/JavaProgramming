package day25_CustomMethods_Overloading;

public class reverse {

    public static int [] reverseTheArray (int [] arr1) {
        int [] result = new int [arr1.length];
        for (int i = arr1.length -1, j=0  ; i >=0 ; i--, j++) {
                result [j] = arr1[i];
            }
        return result;
    }
    public static double [] reverseTheArray (double [] arr2) {
        double [] result = new double [arr2.length];
        for (int i = arr2.length -1, j=0  ; i >=0 ; i--, j++) {
            result [j] = arr2[i];
        }
        return result;
    }
    public static char [] reverseTheArray (char [] arr3) {
        char [] result = new char [arr3.length];
        for (int i = arr3.length -1, j=0  ; i >=0 ; i--, j++) {
            result [j] = arr3[i];
        }
        return result;
    }
    public static String [] reverseTheArray (String [] arr4) {
        String [] result = new String [arr4.length];
        for (int i = arr4.length -1, j=0  ; i >=0 ; i--, j++) {
            result [j] = arr4[i];
        }
        return result;
    }
// reverses the given String and returns the new String

}




/*
1. Create a method that can reverse an integer array
2. Create a method that can reverse a double array
3. Create a method that can reverse a char array
4. Create a method that can reverse a String array
 */