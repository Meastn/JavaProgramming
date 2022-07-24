package Replit;

import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Select screen size:");
        String screenSize= scan.nextLine();
        System.out.println("Select CPU type:");
        String cpuType= scan.nextLine();
        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        scan.nextLine();
        System.out.println("Select storage type:");
        String storageType= scan.nextLine();
        System.out.println("Enter memory size:");
        String driveSize= scan.nextLine();
        System.out.println("Enter screen resolution:");
        String screenRes = scan.nextLine();
        double laptopPrice = 0.0;
        int screenPrice = 200;
        int cpuPrice = 150;
        int ramPrice = 50;
        int storagePrice = 50;
        int drivePrice = 200;
        int resolutionPrice = 100;



        switch (screenSize) {
            case "17.3":
                screenPrice = 400;
                break;
            case "15.0":
                screenPrice = 300;
                break;
            case "13.3":
                screenPrice = 200;
                break;
            default:
                screenPrice = 200;
        }

        switch (cpuType) {
            case "i5":
                cpuPrice = 250;
                break;
            case "i7":
                cpuPrice = 350;
                break;
            case "i3":
                cpuPrice = 150;
                break;
            default:
                cpuPrice = 150;
        }

        switch (ramSize) {
            case 4:
                ramPrice = 50;
                break;
            case 8:
                ramPrice = 100;
                break;
            case 12:
                ramPrice = 150;
                break;
            case 16:
                ramPrice = 200;
                break;
            default:
                ramPrice = 50;
        }


        switch (storageType) {
            case "HDD":
                switch (driveSize) {
                    case "1000":
                        drivePrice =100;
                        break;
                    default:
                        drivePrice =50;
                } break;
            default:
                switch (driveSize) {
                    case "1000":
                        drivePrice =200;
                        break;
                    default:
                        drivePrice =100;
                }
        }

        switch (screenRes) {
            case "4K":
                resolutionPrice = 200;
                break;
            case "FullHD":
                resolutionPrice = 100;
                break;
            default:
                resolutionPrice = 100;
        }

        laptopPrice =  screenPrice + cpuPrice + ramPrice + resolutionPrice + drivePrice;
        System.out.println("Laptop price is: $" + laptopPrice);

    }

}


/*
Write a program that will calculate laptop price based on the components.

First ask user for a screen size.

If screen size is equals to 13.3, add $200 to the laptop price.
If screen size is equals to 15.0 - add $300 to the laptop price.
If screen size is equals to 17.3 - add $400 to the laptop price.
Then ask user for CPU type.

If CPU type equals to i3, add $150 to the laptop price.
If CPU type equals to i5, add $250 to the laptop price.
If CPU type equals to i7, add $350 to the laptop price.
Then ask user for RAM size.

Add $50 for every 4GB of ram to the laptop price.
Then, ask user for storage type. There are 2 options: SSD and HDD.

If it's HDD - add $50 to the laptop price for every 500gb.
If it's SSD - add $100 to the laptop price for every 500GB.
Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.

Add $100 if it's FULLHD screen
Add $200 if it's 4K screen.
Example:
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0


Example 2:
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter memory size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0
 */