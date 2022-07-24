package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9,24));

        ArrayList<Integer> uniques = new ArrayList<>();
        System.out.println("--------WITHOUT A NESTED LOOP------");
        for (Integer each : nums) {
            int frequency = Collections.frequency(nums, each); // finds the frequency of each element
            if (frequency == 1) {
                uniques.add(each);
            }
        }
        System.out.println(uniques);
        System.out.println("--------WITHOUT ANY  LOOP----------");

        ArrayList<Integer> unique2 = new ArrayList<>(nums);

        unique2.removeIf(p -> Collections.frequency(nums, p)>1);
        System.out.println(unique2);
    }
}
