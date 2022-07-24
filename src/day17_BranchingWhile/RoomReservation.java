package day17_BranchingWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room");
        String response = scan.next().toLowerCase();
        int price = 0;

        while (!(response.equals("yes") && response.equals("no"))) {

            if (response.equals("yes")) {
                scan.nextLine();
                System.out.println("Select a room you want to reserve:");
                String room = scan.nextLine().toLowerCase();

                while (!(room.equals("king bed") && room.equals("queen bed") && room.equals("single bed"))) {

                    if (room.equals("king bed")) {
                        price = 120;
                        System.err.println("Your choice is a room with a " + room.toUpperCase());
                        System.out.println("Price is: " + price + " USD");
                        break;
                    }
                    if (room.equals("queen bed")) {
                        price = 100;
                        System.err.println("Your choice is a room with a " + room.toUpperCase());
                        System.out.println(room + ": " + price + " USD");
                        break;
                    }
                    if (room.equals("single bed")) {
                        price = 80;
                        System.err.println("Your choice is a room with a " + room.toUpperCase());
                        System.out.println("Price is: " + price + " USD");
                        break;
                    } else {
                    System.out.println("Invalid entry. Select a room you want to reserve:");
                    room = scan.nextLine().toLowerCase();}

                }
            } else if (response.equals("no")) {
                System.out.println("Have a nice day!");
                break;
            } else {
                System.out.println("Invalid entry. Reply Again Please");
                response = scan.next().toLowerCase();}
        }
    }
}

/*

write a program for the room reservation,
your program asks the user wants to reserve a room.
   if user entered yes, then ask which type of
   room the user wants to reserve. if user entered no,
   print "have a nice day"
    	(if user entered any invalid answer
    	(other than yes/no) ask user to reenter until
    	user provides a valid entry)

	    King Bed ==> 120$
	    Queen Bed ==> 100$
	    single Bed ==> 80$

    the program should be able to display the room
    he/she reserved and total price of the room.

    (if the user selected an invalid room,
    ask the user to reselect the room until user provides a valid entry)

 */