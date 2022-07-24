package day21_ArraysUtilityForEachLoop;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int [] arr1 = {3,1,2};
        int [] arr2= {1,2,3};

        boolean b1 = Arrays.equals(arr1,arr2);
        System.out.println("b1 = " + b1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean b2 = Arrays.equals(arr1,arr2);
        System.out.println("b2 = " + b2);
        System.out.println("-----------");

        char[] ch1 = {'a','b','c'};
        char [] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals (ch1,ch2);
        System.out.println("anagram = " + anagram);
    }
}
