package day13_Strings;

import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String travelCountry = "";
        int baseCost = 0;
        byte numberOfPeople = 0;
        byte numberOfBags = 0;
        String companionNames;
        int passportExpiration = 0;
        boolean nextTravelValidation;

        System.out.println("Do you have a valid passport?");
        Boolean validPassport = scan.nextBoolean();
        if (validPassport) {
            baseCost = 1000;
            System.out.println("Which country will you be travelling to?");
            travelCountry = scan.next();
            System.out.println("How many bags will you take with you?");
            numberOfBags = scan.nextByte();
            baseCost = baseCost + (numberOfBags * 50);
            System.out.println("How many people will you travel with?");
            numberOfPeople = scan.nextByte();
            switch (numberOfPeople) {
                case 0:
                    System.out.println("Invalid Entry");
                    baseCost = baseCost;
                    break;
                case 1:
                    baseCost = baseCost - 100;
                    break;
                case 2:
                    baseCost = baseCost - 200;
                    break;
                default:
                    baseCost = baseCost - 300;
            }

            /* if (numberOfPeople >= 1 && numberOfPeople <= 3) {
                baseCost = baseCost - (numberOfPeople * 100);
            } else if (numberOfPeople > 3) {
                baseCost = baseCost - 300;
            } else {
                System.out.println("Invalid entry");
                baseCost = baseCost;
            }
            */
            scan.nextLine();
            System.out.println("Enter the name of your travel companions seperated with a comma: ");
            companionNames = scan.nextLine();
            System.out.println("Your ticket is booked to " + travelCountry + ". \nWe have charged you  for " + numberOfBags + " extra bags. \nBut since you are traveling with " +
                    numberOfPeople + " extra companions, we are giving you a special discount.\nYour total cost is "+  baseCost + " US Dollars.");
            }
            else {
                System.out.println("The base cost of the passport renewal is: 200");
                baseCost = 200;
            System.out.println("How many years ago did your passport expired?");
            passportExpiration = scan.nextInt();
            baseCost = baseCost + (passportExpiration*75);
            System.out.println("Which country will you be travelling to?");
            travelCountry = scan.next();
            System.out.println("Will you be traveling in the next year");
            nextTravelValidation = scan.nextBoolean();
             if (nextTravelValidation) {
                 baseCost = baseCost + 100;
             } else {
                 baseCost = baseCost - 50;
             }
            System.out.println("Looks like your password has been expired for " + passportExpiration + " years.\nBut not to worry." +
                    "\nWe will get it ready for you to travel to " + travelCountry + "\nYour total cost has come out as " +  baseCost + " US Dollars.");


            }
        }
    }



/*

Create a class calledTravel. Make a cost variable to calculate how much the person
will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit
                			of 300.
            		Ask the user to Enter the name of the people they will travel with
            		in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra
            		for the $numberOfBags bags but you are traveling with
            		 $peopleYouTravelWith so we are giving a discount.
            		 Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year
		            (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			but not to worry we will get it ready for you to travel to $allCountries.
        			Your total cost has come out to $costAmount."
 */