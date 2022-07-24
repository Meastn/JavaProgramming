package practice;

import java.util.Scanner;

public class EggBasket2_Book {
    public static void main(String[] args) {

        int numberOfBaskets, eggsPerBasket, totalEggs, takenEggs;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of eggs in each basket: ");
        eggsPerBasket = keyboard.nextInt();
        System.out.println("Enter the number of baskets: ");
        numberOfBaskets = keyboard.nextInt();

        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.println("If you have " + eggsPerBasket + " eggs per basket and " + numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);



        System.out.println("\nHow many eggs dou you want to take from each basket?");
        takenEggs = keyboard.nextInt();

        eggsPerBasket = eggsPerBasket - takenEggs;
        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.println("Now you have " + eggsPerBasket + " eggs per basket and " + numberOfBaskets + " baskets.");
        System.out.println("The new total number of eggs is " + totalEggs);
    }
}
