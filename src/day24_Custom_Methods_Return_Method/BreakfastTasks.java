package day24_Custom_Methods_Return_Method;

import java.util.Locale;
import java.util.Arrays;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Cydeo", "Woodenboy");
        // getDomain("melih.calikoglu@protonmail.com");
        System.out.println("--------");
        String[] emails = {"josh@gmail.com", "jane@yahoo.com", "blop@protonmail.com", "hello@me.com", "gubbit@cydeo.com"};

        for (String email : emails) {

            getDomain(email);

        }
        System.out.println("--------");
        nameOfMonth(15);
        System.out.println("--------");
        nameOfDay(4);
        System.out.println("--------");
        daysInMonth(2, 1084);
        System.out.println("--------");
        ageGroups(160);
    }

    // Create a function that can display the initials of the person. initials(String firstName, String surName)
    public static void initials(String firstName, String surName) {

        String initial = firstName.charAt(0) + "." + surName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }
    // Create a function that can get domain provider from an email.

    public static void getDomain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf(".")).toUpperCase();
        System.out.print(domain + ", ");

    }

    // Create a method that can display thename of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String monthName = "";

        if (number >= 1 && number <= 12) {
            //12 conditions
            monthName = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : (number == 12) ? "Dec" : "Invalid";
        } else {
            monthName = "Invalid";
        }
        System.out.println();
        System.out.println("Name of the Month = " + monthName);

    }

    // Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        String dayName = "";
        if (number >= 1 && number <= 7) {
            // 7 conditions and a terniary
            dayName = (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" : (number == 4) ? "Thu"
                    : (number == 5) ? "Fri" : (number == 6) ? "Sat" : (number == 7) ? "Sun" : "Invalid";
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Name of the Day is: " + dayName);

    }

    // Create a method that can print how many days a month has 28,29(leap year), 30,31

    public static void daysInMonth(int number, int year) {
        String monthName = "";

        if (number >= 1 && number <= 12) {
            if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
                System.out.println(number + "th month of year " + year + "  has 31 days ");
            } else if (number == 4 || number == 6 || number == 9 || number == 11) {
                System.out.println(number + "th month of year " + year + "  has 30 days ");
            } else {
                if (year % 4 == 0) {
                    System.out.println(number + "nd month of year " + year + "  has 29 days ");
                } else {
                    System.out.println(number + "nd month of year " + year + "  has 28 days ");
                }
            }
        }

    }

    // Create a method that can tpe age group of a person from the given number to the method
    public static void ageGroups(int age) {
        String ageGroup = "";
        if (age >= 0 && age <= 150) {
            ageGroup = (age >= 1 && age <= 2) ? "Infant" : (age >= 3 && age <= 5) ? "Toddler"
                    : (age >= 6 && age <= 9) ? "Kid" : (age >= 10 && age <= 12) ? "Pre-Teen"
                    : (age >= 13 && age <= 17) ? "Teenager" : (age >= 8 && age <= 20) ? "Young Adult"
                    : (age >= 21 && age <= 39) ? "Adult" : (age >= 40 && age <= 49) ? "Young Middle Aged Adult"
                    : (age >= 50 && age <= 54) ? "Middle Aged Adult" : (age >= 55 && age <= 64) ? "Very Young Senior Citizen"
                    : (age >= 65 && age <= 74) ? "Young Senior Citizen"
                    : (age >= 75 && age <= 84) ? "Senior Citizen"
                    : (age >= 85) ? "Old Senior Citizen":"Invalid";
            System.out.println("You are a " + ageGroup+".");
        } else {
            System.out.println("Invalid Entry");
        }


    }
}
