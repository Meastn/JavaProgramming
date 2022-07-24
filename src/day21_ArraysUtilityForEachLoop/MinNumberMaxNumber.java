package day21_ArraysUtilityForEachLoop;
import java.util.Arrays;
public class MinNumberMaxNumber {
    public static void main(String[] args) {
        int[]numbers = {2,45,22,65,75,24,52};
        int max = numbers [0];
        int min= numbers [0];
        double sum = 0.0;

        for (int each : numbers) {
            if (each > max){
                max = each;
            }

        }
        for (int eachmin : numbers) {
            if (eachmin< min){
                min=eachmin;
            }



        }
        for (double total : numbers) {
            sum += total;

        }
        double average = sum / numbers.length;

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        }
    }

