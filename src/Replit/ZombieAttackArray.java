package Replit;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class ZombieAttackArray {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        int[] inhabitants = new int[] {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt() };
        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        int length = inhabitants.length;
        int sum;
        int day = 0;
        do{
            day++;
            sum = 0;
            int [] temp = Arrays.copyOf(inhabitants, length);
            for (int j = 0; j < length; j++) {
                if(inhabitants[j]==0 && j != 0 && j != length-1) {
                    temp[j-1] =inhabitants[j-1] /2;
                    temp[j+1] =inhabitants[j+1] /2;
                }else if(j == 0 && inhabitants[j]==0) {
                    temp[j+1] = inhabitants[j+1] /2;
                }else if(j == length-1 && inhabitants[j]==0) {
                    temp[j-1] = inhabitants[j-1] /2;
                }
            }
            for(int i = 0; i < length; i++) {
                inhabitants[i] = temp[i];
            }
            for (int city : inhabitants) {
                sum += city;
            }
            System.out.println("Total Population =" + sum);

            System.out.println("Day " + day + " " +Arrays.toString(inhabitants));

            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
        }while(sum != 0);
    }
}





/*
An array inhabitants represents
cities and their respective populations.
For example, the following arrays shows 8 cities
and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 0]
Some cities have a population of 0 due to a
pandemic zombie disease that is wiping out the human
lives. After each day, any city that is adjacent to
a zombie-ridden city will lose half of its population
(City that has a 0 population).

Write a program to loop though each city population
and make it lose half of its population if it is
adjacent(right or left) to a city with zero people
until all cities have no humans are left.

Make updates to each element in the array
And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
Write the program in a way that it will handle
any number of people in cities, above was just an example.
 */