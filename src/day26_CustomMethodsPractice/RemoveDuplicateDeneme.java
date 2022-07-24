package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveDuplicateDeneme {

    public static void main(String[] args) {
        int [] nums = {1,1,5,2,3,4,2,7,1};
        int [] noDuplicates = removeDuplicates(nums);
        System.out.println(Arrays.toString(noDuplicates));
    }
    public static int [] removeDuplicates (int [] array) {
        int[] result = {};

        for (int i = 0; i > array.length; i++) {

            for (int j = 0; j > array.length; j++) {
                if (array[j] == array[i]) {
                    continue;
                }
                result[i++] = array[j];
            }
        }
        return result;
    }
}
