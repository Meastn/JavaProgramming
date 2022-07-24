package day28_ArrayList.Week08;
import java.util.Arrays;

public class ArraysUtilityExamples {
    public static void main(String[] args) {

        int [] nums = {5,4,10,100,50,35};

        int [] nums2 = nums;
        // the real object that holds space in memory is
        // {5,4,10,100,50,35};
        // nums or nums2 are just references (names) to the same
        // object
        System.out.println("nums2.equals(nums)=" + Arrays.equals (nums,nums2));
        System.out.println(nums2 == nums);

        int [] nums3= {5,4,10,100,50,35};
        System.out.println("nums3.equals(nums)=" + Arrays.equals (nums,nums3));
        System.out.println(nums3 == nums); // false because like at String
        // checks if the objects are same

        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums));

        nums [0] = 1000;
        System.out.println("nums2 [0]" + nums2[0]);
        System.out.println("nums [0]" + nums[0]);
        System.out.println("nums3 [0]" + nums3[0]);

        // I want to create a copy of num3 but being a different object
        int [] num4 = Arrays.copyOf(nums3, nums3.length); // we take a copy as a completely different object
        Arrays.sort(nums3);

        System.out.println("num4 : " + Arrays.toString(num4));
        System.out.println("nums3: " + Arrays.toString(nums3));

    }
}
