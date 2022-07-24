package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        char [] numbers = {'A','B', 'C', 'D'};

        numbers = ArraysUtility.removeElements(numbers, 2);
        System.out.println(Arrays.toString(numbers));

        String [] numbers2 = {"Hello", "is", " magical", "word"};
        numbers2 = ArraysUtility.reverseArray(numbers2);
        System.out.println(Arrays.toString(numbers2));

        int [] nums = {2,3,4,5,2,5,7,6,2};
        double [] dnums = {1.1, 2.1, 1.1, 3.1, 2.1};
        String [] list = {"Herro", "Merro", "Herro", "Hurro", "Burro"};
        int result = ArraysUtility.freqOfElement(nums, 6);
        System.out.println("result = " + result);
        System.out.println("Integer Element is unique :" + ArraysUtility.uniqueElement(nums, 6));
        System.out.println("Decimal Element is unique :" + ArraysUtility.uniqueElement(dnums, 1.1));
        System.out.println("String Element is unique :" + ArraysUtility.uniqueElement(list, "Merro"));
        int [] noDuplicates = ArraysUtility.removeDuplicates(nums);
        System.out.println(Arrays.toString(noDuplicates));
    }

}
