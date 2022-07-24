package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String [] employees = {"Ali", "Ayşe", "Mehmet", "Ahmet", "Hasan", "Remzi"};
        String [] devTeam = Arrays.copyOf(employees,3);
        System.out.println("Our Employees: " + Arrays.toString(employees));
        System.out.println("Our devTeam  : "+ Arrays.toString(devTeam));

        int [] scores = {10,12,34,76,44,23,10,89,65};
        int [] result = Arrays.copyOfRange(scores,3,scores.length);
        scores = Arrays.copyOf(scores,5);


        System.out.println(Arrays.toString(result));
        System.out.println("Scores new =" + Arrays.toString(scores));


    }
}
