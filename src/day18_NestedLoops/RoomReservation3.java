package day18_NestedLoops;

import java.util.Scanner;

public class RoomReservation3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean condition = false;
        int price = 0;
        int nights =0;
        int totalPrice =0;
        System.out.println("Do you want to reserve a room?");
        String response = scan.next().toLowerCase();
        while (!response.equals("yes") && !response.equals("no")){
            System.out.println("Enter a valid response");
            response = scan.next().toLowerCase();
        }
        if (response.equals("yes")) {
            condition = true;
        }

        while (condition) {
            System.out.println("Our Room Prices Are:");
            System.out.println("------------------------");
            System.out.println("\tKing Bed   ==> 120 $");
            System.out.println("\tQueen Bed  ==> 100 $");
            System.out.println("\tSingle Bed ==>  80 $");
            System.out.println("------------------------");
            System.out.println("Select a room type:");
            scan.nextLine();
            String roomType = scan.nextLine().toLowerCase();
            while (!response.equals("king bed") && !response.equals("queen bed") && !response.equals("single bed")){
                System.out.println("Enter a valid response");
                roomType = scan.next().toLowerCase();
            }
            if (roomType.equals("king bed")) {
                price = 120;
            } else if (roomType.equals("queen bed")) {
                price =100;
            } else {
                price = 80;
            }
            System.out.println("How many nights do you plan to stay?");
            nights = scan.nextInt();
            totalPrice = price * nights;

            System.out.println("Your total price is : " + totalPrice);
            System.out.println("Do you want to reserve another room?");
            response = scan.next().toLowerCase();
            while (!response.equals("yes") && !response.equals("no")){
                System.out.println("Enter a valid response");
                response = scan.next().toLowerCase();
            }
            if (!response.equals("yes")) {
                condition = false;
            }
        }
        System.out.println("Have a nice day!");

    }
}
