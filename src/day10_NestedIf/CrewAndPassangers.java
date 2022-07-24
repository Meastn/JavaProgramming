package day10_NestedIf;
import java.util.Scanner;
public class CrewAndPassangers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of passengers to board the ship: ");
        int numPassengers = scan.nextInt();
        String result = "";
        boolean validState = numPassengers==30 || numPassengers==50 || numPassengers==70;

        if (validState) {
            result = (numPassengers >= 1 && numPassengers <= 30) ? "20 crew" : (numPassengers >= 31 && numPassengers <= 50) ? "25 crew"
                    : "30 crew";
        } else {
            result = "Invalid Entry";
        }

        System.out.println( result);
    }
}
/*
Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */