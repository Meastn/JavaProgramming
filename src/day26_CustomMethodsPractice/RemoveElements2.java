package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int [] numbers = {100,200,300,400,500};
        numbers = removeElement(numbers, 3);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeElement(int[] array, int index) {

            if (index < 0 || index > array.length-1) {
                System.err.println("Invalid index number : " + index);
                System.exit(0);
            }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElements(result, array[i]);
            }
        }
        return result;
    }
}
