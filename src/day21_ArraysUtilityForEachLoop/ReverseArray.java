package day21_ArraysUtilityForEachLoop;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] numbers = { 10,20,30,40,50,60,70,80};

        int [] reversed = new int [numbers.length];//final result should be {50,40,30,20,10}


        for (int i= numbers.length-1, j=0;i>=0; i--, j++) {

            reversed[j] = numbers[i];
        }

        System.out.println(Arrays.toString(reversed));
    }
}

/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
        output:
            reversedArray = {5,4,3,2,1};
 */