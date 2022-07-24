package day04_Variables;

import java.util.Scanner;

public class CalculateBodyMassIndex {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in); //   requests the value of the radius to calculate circles specs
        System.out.println("\nPlease Enter your height:");
        double height = scan.nextDouble();
        System.out.println("\nPlease Enter your weight:");
        double weight = scan.nextDouble();
        scan.close();

        char harf = 'E';
        double BMI = (weight/(height*height));

        System.out.println("Your BMI is : " + BMI);
        System.out.println(harf);
    }
}
