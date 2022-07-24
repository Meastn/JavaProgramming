package day10_NestedIf;
import java.util.Scanner;

public class NestedIfIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your score?:");
        int score = scan.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Score is not valid");
        }
        System.out.println("==========");
        System.out.print("What is your age?:");
        int age = scan.nextInt();
        System.out.print("Do you have an ID? (y/n):");
        char hasId = scan.next().charAt(0);

        if (hasId == 'y') {
            if (age >= 21) {
                System.out.println("You are elligible to buy alcohol.");
            } else {
                System.out.println("You are not elligible.");
            }
        }else {
            System.out.println("First you must have an ID.");
        }

        System.out.println("==============");
        System.out.print("Enter the number of the day:");
        int number = scan.nextInt();

        if (number >=1 && number <= 7) { // check if the number is valid between 1-7
            if (number==1) {
                System.out.println("It's Monday");
            } else if (number==2){
                System.out.println("It's Tuesday");
            }else if (number==3) {
                System.out.println("It's Wednesday");
            }else if (number==4) {
            System.out.println("It's Thursday");
            }else if (number==5) {
                System.out.println("It's Friday");
            }else if (number==6) {
                System.out.println("It's Saturday");
            }else {
                System.out.println("It's Sunday");
            }
        } else {
            System.out.println("Your entry is not valid.");
        }




    }
}
