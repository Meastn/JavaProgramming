package Replit;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int price = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");

        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        String houseType = scan.nextLine();


        switch (houseType) {
            case "Condo":
                price = 50000;
                break;
            case "Townhouse":
                price = 75000;
                break;
            case "Single Family Home":
                price = 95000;
                break;

        }
        System.out.println("How many bedrooms do you have?");
        int roomPrice = scan.nextInt();
        price += 30000 * roomPrice;

        System.out.println("Do you have a backyard?");
        boolean backyard = scan.nextBoolean();
        if (backyard) {
            switch (houseType) {
                case "Condo":
                    System.out.println("Backyard is not available for condo!");
                    // propertyPrice = propertyPrice;
                    break;
                default:
                    price += 5000;
            }
        }

        System.out.println("Do you have garage?");
        boolean garage= scan.nextBoolean();
        if (garage) {
            System.out.println("How many spots?");
            int garageSpots = scan.nextInt();
            switch (garageSpots) {
                case 0:
                    System.out.println("Invalid Entry!");
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    price += garageSpots * 20000;
                    break;
                default:
                    System.out.println("Pardon, it's not a public parking!");

            }
        } else {
        }


        System.out.println("How close is metro station?");
        float metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1.0) {
            price += 10000;
        } else if (metroAccessibility >= 1.1 && metroAccessibility <= 3.0) {
            price += 5000;
        } else {
        }

        System.out.println("How close is highway?");
        float highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <= 1.0) {
            price += 15000;
        } else if (highwayAccessibility >= 1.1 && highwayAccessibility <= 5.0) {
            price += 8000;
        } else if (highwayAccessibility >= 5.1 && highwayAccessibility <= 20.0) {
            price += 4000;
        } else if (highwayAccessibility <= 0.0) {
            System.out.println("Invalid Entry! Not added to the result.");
        } else {
        }

        System.out.println("What's the rating of nearest school?");
        int schoolScore = scan.nextInt();
        if (schoolScore >= 8 && schoolScore <= 10) {
            price += 45000;
        } else if (schoolScore >= 4 && schoolScore <= 7) {
            price += 20000;
        } else {
            price += 5000;
        }
        System.out.println("Does any of your family members smoke?");
        boolean smoking = scan.nextBoolean();
        if (smoking) {
            price -= 5000;
        } else {
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + price + "$");


    }


}




        /*
        This program should work with 3 house types:

Condo, Townhouse and Single Family Home.
Starting price for Condo = 50000, for Townhouse = 75000, Single Family Home = 95000.
Based on number of bedroom:
add 30000 for every bedroom
Then you need to ask if property has backyard.
Add 5000 to the property price if it's true.
Backyard shouldn't be available for Condo,
so display message "Backyard is not available for condo!",
(don't increase property price!), in case someone would try to select backyard for condo.
Then ask user if there is a garage or not.
If the property has garage, add 20000 to the property price for every spot. If amount of garage spots exceeds 10 spots (greater then 10), display message: "Pardon, it's not public parking!" and don't increase property price.
Then, ask user for metro accessibility.
If metro is closer than 1 mile (inclusive), add 10000to the property price. If metro is in the radius from 1 mile to 3 miles, add to the property price 5000.
Then, ask user for highway accessibility.

If highway is closer than 1 mile (inclusive), add 15000 to the property price.
If highway is in the radius from 1 to 5 miles, add 8000 to the property price.
And if highway is in the radius from 5 mile to 20 miles (inclusive),
add 4000 to the property price.

Then your program should ask about nearest school rating.
If school's rating is in the range from 10 (inclusive) to 8 points,
add 45000 to the property price.
If school's rating is less than 8 points and more or equals to 4 points,
add 20000 to the property price. Otherwise, add 5000 to the property price.

Then, ask user if any of the family members smoke. If so, reduce property price by 5000.

At the end, display message: "Market report has been generated.", and display underneath: "Your estimate market price is: propertyPrice$"
Given:
-int propertyPrice = 0; -int numberOfBedrooms, garageSpots; -float metroAccessibility, schoolScore, highwayAccessibility; -boolean backyard, smoking, garage;
Example 1
Welcome to the RealEstate calculator!
Enter your property type:
Condo

How many bedrooms do you have?
3

Do you have a backyard?
true
Backyard is not available for condo!

Do you have garage?
true
How many spots?
2

How close is metro station?
0.5

How close is highway?
1.5

What's the rating of nearest school?
9

Does any of your family members smoke?
true

Market report has been generated.
Your estimate market price is: 238000$
         */