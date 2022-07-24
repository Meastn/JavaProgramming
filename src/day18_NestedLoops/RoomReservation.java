package day18_NestedLoops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Our Room Prices Are:");
        System.out.println("------------------------");
        System.out.println("\tKing Bed   ==> 120 $");
        System.out.println("\tQueen Bed  ==> 100 $");
        System.out.println("\tSingle Bed ==>  80 $");
        System.out.println("------------------------");
        System.out.println("Do you want to reserve a room?");
        String response = scan.next().toLowerCase();
        int price = 0;
        int totalPrice =0;
        int nights = 0;
        String repeat ="yes";
        while (true) {
            while (!(response.equals("yes") && response.equals("no"))) {

                if (response.equals("yes")) {
                    scan.nextLine();
                    System.out.println("Select a room you want to reserve:");
                    String room = scan.nextLine().toLowerCase();

                    while (!(room.equals("king bed") && room.equals("queen bed") && room.equals("single bed"))) {
                        if (room.equals("king bed")) {
                            price = 120;
                            System.out.println("Your choice is a room with a " + room.toUpperCase());
                            System.out.println("How many nights do you plan to stay?");
                            nights = scan.nextInt();
                            price = price *nights;
                            break;
                        } else if (room.equals("queen bed")) {
                            price = 100;
                            System.out.println("Your choice is a room with a " + room.toUpperCase());
                            System.out.println("How many nights do you plan to stay?");
                            nights = scan.nextInt();
                            price = price *nights;
                            break;
                        } else if (room.equals("single bed")) {
                            price = 80;
                            System.out.println("Your choice is a room with a " + room.toUpperCase());
                            System.out.println("How many nights do you plan to stay?");
                            nights = scan.nextInt();
                            price = price *nights;
                            //break;
                        } else {
                            System.out.println("Invalid entry. Select a room you want to reserve:");
                            room = scan.nextLine().toLowerCase();
                        }

                    }
                }
                else if (response.equals("no")) {
                    System.out.println("Have a nice day!");
                    System.exit(1);
                } else {
                    System.out.println("Invalid entry. Reply Again Please");
                    response = scan.next().toLowerCase();
                }

                break;
            }
            totalPrice += price;
            System.out.println("Do you want to reserve another room?");
            repeat = scan.next().toLowerCase();


            if (repeat.equals("no")) {
                System.out.println("---------------------");
                System.err.println("Total price is " + totalPrice + " $");
                System.out.println("Have a nice day!");
                System.exit(1);
            }
        }
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