package day25_CustomMethods_Overloading;

public class mergeArrays {


    public static int[] mergeArrays (int[] arr1, int[] arr2) {

        int [] merger = new int [arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merger [i] = arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            merger [i+arr1.length] = arr2[i];
        }

        return merger;
    }
    public static double[] mergeArrays (double[] arr3, double[] arr4) {

        double [] merger = new double [arr3.length + arr4.length];
        for (int i = 0; i < arr3.length; i++) {
            merger [i] = arr3[i];
        }
        for (int i = 0; i < arr4.length ; i++) {
            merger [i+arr4.length] = arr4[i];
        }
        return merger;
    }
    public static String[] mergeArrays (String[] arr5, String[] arr6) {

        String [] merger = new String [arr5.length + arr6.length];
        for (int i = 0; i < arr5.length; i++) {
            merger [i] = arr5[i];
        }
        for (int i = 0; i < arr6.length ; i++) {
            merger [i+arr6.length] = arr6[i];
        }
        return merger;
    }
    public static char[] mergeArrays (char[] arr7, char[] arr8) {

        char [] merger = new char [arr7.length + arr8.length];
        for (int i = 0; i < arr7.length; i++) {
            merger [i] = arr7[i];
        }
        for (int i = 0; i < arr8.length ; i++) {
            merger [i+arr8.length] = arr8[i];
        }
        return merger;
    }
}


/*

1. create a method that can merge two integer arrays.
2. create a method that can merge two double arrays.
3. create a method that can merge two char arrays.
4. create a method that can merge two String arrays.
 */