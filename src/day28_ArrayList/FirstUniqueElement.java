package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 4, 3,8, 1, 16, 32, 8, 64, 4, 128));
        System.out.println(nums);

        for (Integer each : nums) { // checks each element in an array
            int frequency =0;
            for (Integer element : nums) { // checks if the each is repeated as an element
                if (element == each) {
                    frequency ++;
                }
            }
            if (frequency == 1 ){
                System.out.println(each);
                break;
            }
        }




    }
}

/*
Write a program that can return the first unique element in an ArrayList
Do not use indexOf & lastIndexOf methods
 */