package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[]numbers = {10,5,4,20,0,34,456};
        int max = numbers [0]; // at the beginning the max numbers is assumed to be the first indexed element of the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) { // if there is an element greater than the max
                max = numbers [i];
            }
        }
        System.out.println(max);
    }
}
