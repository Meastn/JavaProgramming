package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        int [] nums1 = insertElement(nums, 10, 888);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("nums1 = " + Arrays.toString(nums1));

    }

    public static int [] insertElement (int [] array, int index, int element){
        if (index < 0 || index > array.length-1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        int [] firstPart = new int [index];
        int [] secondPart = new int [array.length-index];
        int [] result = new int[firstPart.length + secondPart.length+1];



        for (int i=0; i<firstPart.length; i++){
            firstPart [i] =array[i];
        }
        int [] midPart = new int [firstPart.length+1];

        midPart  =  ArraysUtility.addElements(firstPart, element);

        for (int i=0; i<secondPart.length; i++) {
            secondPart[i] = array [i+index];
        }
        result = ArraysUtility.mergeArrays(midPart,secondPart);
        return result;
    }

    public static double [] insertElement (double [] array, int index, double element){
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }
        
        double [] firstPart = new double [index];
        double [] secondPart = new double [array.length-index];
        double [] result = new double [firstPart.length + secondPart.length+1];
        

        for (int i=0; i<firstPart.length; i++){
            firstPart [i] =array[i];
        }
        double [] midPart = new double [firstPart.length+1];

        midPart  =  ArraysUtility.addElements(firstPart, element);

        for (int i=0; i<secondPart.length; i++) {
            secondPart[i] = array [i+index];
        }
        result = ArraysUtility.mergeArrays(midPart,secondPart);
        return result;
    }
    public static String [] insertElement (String [] array, int index, String element){
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }
        
        String [] firstPart = new String [index];
        String [] secondPart = new String [array.length-index];
        String [] result = new String [firstPart.length + secondPart.length+1];

        

        for (int i=0; i<firstPart.length; i++){
            firstPart [i] =array[i];
        }
        String [] midPart = new String [firstPart.length+1];

        midPart  =  ArraysUtility.addElements(firstPart, element);

        for (int i=0; i<secondPart.length; i++) {
            secondPart[i] = array [i+index];
        }
        result = ArraysUtility.mergeArrays(midPart,secondPart);
        return result;
    }
    public static char [] insertElement (char [] array, int index, char element){
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        char [] firstPart = new char [index];
        char [] secondPart = new char [array.length-index];
        char [] result = new char [firstPart.length + secondPart.length+1];



        for (int i=0; i<firstPart.length; i++){
            firstPart [i] =array[i];
        }
        char [] midPart = new char [firstPart.length+1];

        midPart  =  ArraysUtility.addElements(firstPart, element);

        for (int i=0; i<secondPart.length; i++) {
            secondPart[i] = array [i+index];
        }
        result = ArraysUtility.mergeArrays(midPart,secondPart);
        return result;
    }

}
