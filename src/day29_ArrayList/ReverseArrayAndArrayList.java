package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,};
        int [] result = new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0; i--,j++) {
            result [j] = arr[i];

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
        System.out.println("------REVERSING AN ARRAYLIST WITHOUT REVERSE METHOD-----");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(2,3,4,5,6,7,8,9,10));
        ArrayList <Integer> reversedNums = new ArrayList<>();
        System.out.println(nums);
        for (int i = nums.size()-1; i >=0; i--) {
            int each = nums.get(i);
            reversedNums.add(each);
        }
        System.out.println(reversedNums);

    }

}
