package day20_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class AverageNumberOfArray {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 30, 40, 50,60};
        double sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        // System.out.println("median = " + median);
    }
}
