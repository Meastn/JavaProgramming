package day18_NestedLoops;

import java.util.Scanner;

public class RoomReservation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        String response = scan.next().toLowerCase();
        while (!response.equals("yes") && !response.equals("no")) {
            System.out.println("Please enter yes or no: ");
            response = scan.next().toLowerCase();
        }
        int price = 0;
        int totalPrice = 0;
        int nights = 0;
        boolean reserveRoom = false;
        if (response.equals("yes")) {
            reserveRoom = true;
        }

        while (reserveRoom) {

            System.out.println("Our Room Prices Are:");
            System.out.println("------------------------");
            System.out.println("\tKing Bed   ==> 120 $");
            System.out.println("\tQueen Bed  ==> 100 $");
            System.out.println("\tSingle Bed ==>  80 $");
            System.out.println("------------------------");
            System.out.println("Select a room type:");
            scan.nextLine();
            String roomType = scan.nextLine().toLowerCase();
            while (!roomType.equals("king bed") && !roomType.equals("queen bed") && !roomType.equals("single bed")) {
                System.out.println("Please enter a valid room type:");
                roomType = scan.next().toLowerCase();
            }
            if (roomType.equals("king bed")) {
                price = 120;
            } else if (roomType.equals("queen bed")) {
                price = 100;
            } else {
                price = 80;
            }
            System.out.println("How many nights do you plan to stay?");
            nights = scan.nextInt();
            totalPrice += price * nights;

            System.out.println("Do you want to reserve another room?");
            response = scan.next().toLowerCase();
            while (!response.equals("yes") && !response.equals("no")) {
                System.out.println("Please enter yes or no: ");
                response = scan.next().toLowerCase();
            }
            if (response.equals("no")) {
                reserveRoom = false;
            }
        }
        System.out.println("Your Total Price is = " + totalPrice);
        System.out.println("Have a nice day!");

    }
}

/*
2. Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
 */