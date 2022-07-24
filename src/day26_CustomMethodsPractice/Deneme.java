package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {
        int [] nums = {1,1,5,2,3,3,4,2,7,1};
        int [] noDuplicates = removeDuplicates(nums);
        System.out.println(Arrays.toString(noDuplicates));
    }

    public static int [] removeDuplicates (int [] array){

        int [] result = new int [array.length];
        boolean found = false;
        int duplicate =0;
        int k=0;

        for (int i=0; i<array.length; i++) {
            found = false;
            for (int j=i+1; j<array.length && !found; j++) {
                if (array [j] == array[i]) {
                    found = true;
                    duplicate ++;
                }
            }
            if (!found) {
                result[k++] = array [i];
            }

        }
        int [] newArray = new int [array.length-duplicate];
        for (int i=0; i<newArray.length; i++) {
            newArray [i] = result [i];
        }
        return newArray;

    }
}
