package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter populations of 6 cities");
        int[] population = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),
                scan.nextInt(),scan.nextInt()};
        int count = 0;
        int biggest = 0;
        for (int i = 1; i < population.length-1; i++) {
            if (population[i]>population[i+1]){
                biggest= population [i];
            } else {
                biggest=population [i+1];
            }
        }

        while (biggest>0) {
            biggest=biggest/2;
            count ++;
        }
        for (int j=count+2; j>=0; j--){
            for (int i=0; i<population.length; i++) {
                population[i] =population[i]/2;
            }
            System.out.println(Arrays.toString(population));
        }


    }

}




/*
An array **inhabitants** represents cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 1]

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives. After each day, every city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population **until all cities have no humans left**. Make updates to each element in the array And print the array like below for each day:

```
Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
```

Write the program in a way that it will handle any number of people in cities, above was just an example

Hint:

Below expression will print array in this format:

```

System.out.println(Arrays.toString(inhabitants)));

[3, 6, 0, 4, 3, 2, 7, 1]

```
 */