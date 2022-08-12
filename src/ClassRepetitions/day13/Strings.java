package ClassRepetitions.day13;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age= scan.nextInt();
        System.out.print("Enter your gender (F/M): ");
        char gender = scan.next().charAt(0);
        System.out.print("Enter your full name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Enter your phone number: ");
        long phone = scan.nextLong();
        System.out.print("Enter your zip code: ");
        int zip = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your school name: ");
        String school = scan.nextLine();
        System.out.print("Enter your city: ");
        String city = scan.nextLine();
        System.out.print("Enter your state: ");
        String state = scan.next();
        System.out.print("Enter your building number: ");
        int building = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your street name: ");
        String street = scan.nextLine();

        System.out.println(name + ", " + age + ", "+ gender);
        System.out.println(phone);
        System.out.println("Address:");
        System.out.print(building + ", " + street);
        System.out.println(city + ", " + state + ", " + zip);


    }
}


/*
Create a class called MyInfo, Write a program that can
ask the user to:
1. Enter your age (int)
2. Enter your gender (String - one word only-)
3. Enter your full name (String multiple words)
4. Enter your phone number (long)
5. Enter your zip code (int)
6. Enter your school name (String might be multiplex
words
7. Enter your city name (can be multiple words)
8. Enter your state name (string -  one word)
9. Enter your building number (int)
10. Enter your street name,
DISPLAY ALL THE ENTRIES in separate lines
1. full name
2. age
3. gender
4. phone number
5. address:
    buildingnumber Street
    City, State, Zip Code
 */