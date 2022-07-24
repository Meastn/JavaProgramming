package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

import static Utilities.ArraysUtility.mergeArrays;

public class Test2 {
    public static void main(String[] args) {

        int [] arr1 = {1,5,9,11,14,56};

        ArraysUtility.printEachElement(arr1);
        System.out.println("-------------");
        int [] arr3 ={1,5,9,11,14,11};
        int max1 = ArraysUtility.maxNumber(arr3);
        System.out.println(max1);
        System.out.println("-------------");
        int [] arr4 = {1,5,9,11,14,11};
        int num = 11;
        boolean compare = ArraysUtility.contains(arr4, num);
        System.out.println("Array contains number " + num + " = " + compare);
        System.out.println("-------------");
        String [] arr5 = {"Apple","Bee","Zoo"};
        String [] arr6 = {"Clock", "Deer","Yolanda"};
        String [] arr7= ArraysUtility.mergeArrays(arr5, arr6);
        System.out.println(Arrays.toString(arr7));
        String [] arr8 = {"hollo", "mollo"};
        String [] arr9 = ArraysUtility.addElements(arr8,"Kollo");
        System.out.println(Arrays.toString(arr9));
        int []arr10= {1,2,3,4,5};
        int [] arr11 = ArraysUtility.removeElements(arr10, 1);
        System.out.println(Arrays.toString(arr11));
    }


}
