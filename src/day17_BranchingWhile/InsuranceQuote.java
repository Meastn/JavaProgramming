package day17_BranchingWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double price = 100.0;
        System.err.println("Base price for insurance is: " + price + " USD");
        System.out.println();
        System.out.println("Enter your name: ");
        String name = scan.nextLine();


        System.out.println("Enter your gender:");
        String gender = scan.next().toLowerCase();
        while (!(gender.equals("male") || gender.equals("female"))) {
            System.out.println("Invalid Entry. Enter your gender again:");
            gender = scan.next().toLowerCase();
        }

        System.out.println("Enter your age:");
        int age = scan.nextInt();
        while (!(age >= 0 && age < 120)) {
            System.out.println("Invalid Entry. Repeat your answer:");
            age = scan.nextInt();
        }
        System.out.println("Are you married?:");
        String marital = scan.next().toLowerCase();
        while (!(marital.equals("yes") && marital.equals("no"))) {
            if (marital.equals("yes")) {
                price = price - (price * 0.05);
                break;
            } else if (marital.equals("no")) {
                price = price;
                break;
            }
            System.out.println("Invalid Entry. Repeat your answer:");
            marital = scan.next().toLowerCase();

        }
        System.err.println("Cumulative price = " + price);

        System.out.println("How many miles you drive daily?");
        int milage = scan.nextInt();
        while (!(milage >= 0 && milage <= 50)) {
            System.out.println("Invalid Entry. Repeat your answer:");
            milage = scan.nextInt();
        }
        System.err.println("Cumulative price = " + price);
        System.out.println("Did you have any accidents or claims in past 5 years?");
        String claims = scan.next().toLowerCase();
        while (!(claims.equals("yes") && claims.equals("no"))) {
            if (claims.equals("yes")) {
                price = price + (price * 0.15);
                break;
            } else if (claims.equals("no")) {
                price = price - (price * 0.10);
                break;
            }
            System.out.println("Invalid Entry. Repeat your answer:");
            claims = scan.next().toLowerCase();
        }
        System.err.println("Cumulative price = " + price);
        System.out.println("Does your car have an anti-theft device?");
        String antiTheft = scan.next().toLowerCase();
        while (!(antiTheft.equals("yes") && antiTheft.equals("no"))) {
            if (antiTheft.equals("yes")) {
                price = price - (price * 0.05);
                break;
            } else if (antiTheft.equals("no")) {
                price = price;
                break;
            }
            System.out.println("Invalid Entry. Repeat your answer:");
            antiTheft = scan.next();
        }


        System.err.println("Cumulative price = " + price);
        System.out.println("Do you want full coverage or liability insurance?");
        String insuranceType = scan.next().toLowerCase();

        while (!(insuranceType.equals("full") && insuranceType.equals("liability"))) {
            if (insuranceType.equals("full")) {
                // age condition
                if (age >= 25) {
                    price += 160;
                } else if (age < 25) {
                    price += 120;
                }
                // milage condition
                if (milage <= 10) {
                    price += 20;
                } else if (milage > 10 && milage <= 50) {
                    price += 40;
                } else {
                    price += 70;
                }
                break;
            }
            if (insuranceType.equals("liability")) {
                // age condition
                if (age >= 25) {
                    price += 90;
                } else if (age < 25) {
                    price += 50;
                }
                // milage condition
                if (milage <= 10) {
                    price += 10;
                } else if (milage > 10 && milage <= 50) {
                    price += 30;
                } else {
                    price += 50;
                }
                break;
            }
            System.out.println("Invalid Entry. Reply again:");
            insuranceType = scan.nextLine().toLowerCase();

        }
        // scan.nextLine();


        System.out.println("Total insurance price  = " + price);
    }


}

/*
Create a class called InsuranceQuote,
write a program that can calculate the insurance cost of a person
based on the following info:
 1. Ask the user to enter your name
2. Ask the user to enter your gender
   (if user enters invalid entry, ask the user to re-enter until
   user provides a valid entry)
3. Ask the user if he/she is married(Yes/No)
	(if user enters invalid entry, ask the user to re-enter until
	user provides a valid entry)
4. Ask user to enter your age
	(age can not be negative or greater than 120)
	(if user enters invalid entry, ask the user to re-enter until
	user provides a valid entry)
5. Ask user to enter how many miles he/she drives in a day
	(mileage can not be negative or less than 5)
	(if user enters invalid entry, ask the user to re-enter until
	user provides a valid entry)
6. Ask the user if he/she wants full coverage or liability insurance?
7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
	(if user enters invalid entry, ask the user to re-enter until user
	 provides a valid entry)
8. Ask the user if his/her car has an anti-theft device (Yes/No)
	(if user enters invalid entry, ask the user to re-enter until user
	provides a valid entry)
Calculate the price of the insurance and display all the info of the user
Insurance Quote calculation:
	starting prices for liability:
		age < 25 ===> 90
		age >= 25 ==> 50
        miles <= 10 ====> $10
		miles > 10 and miles <= 50 ==> $30
		miles > 50 ===>  $50
	starting prices for full coverage:
		age < 25 ===> 160
		age >= 25 ==> 120
        miles <= 10 ====> $20
	    miles > 10 and miles <= 50 ==> $40
		miles > 50 ===>  $70
     If the car has anti-theft device ==> 5% discount
	 If he/she had any accidents or claims in past 5 years ===>
	 15% extra charge
	 If he/she never had any accidents or claims in past 5 years ==>
	 10% discount
	 If he/she is married ==> 5% discount
 */