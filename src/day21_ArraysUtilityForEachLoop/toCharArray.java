package day21_ArraysUtilityForEachLoop;

import java.util.Arrays;

public class toCharArray {
    public static void main(String[] args) {
        String str = "Process finished with exit code";
       str=  str.replace(" ", "");

       char [] array = str.toCharArray();
        System.out.println(Arrays.toString(array));

        for (char each : array) {
            System.out.print(each + "\t");
        }
    }
}
