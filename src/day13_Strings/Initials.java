package day13_Strings;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = scan.next();
        System.out.println("Enter your middle name: ");
        String middleName = scan.next();
        System.out.println("Enter your last name: ");
        String surname = scan.next();

        char f = name.charAt(0);
        char m = middleName.charAt(0);
        char l = surname.charAt(0);


        char lastChar= name.charAt(name.length()-1);

        String initials = "" + f + m + l;
        System.out.println("Your initials are: " + initials);
        System.out.println();
        System.out.println("Last Character of your surname is: " + lastChar);

        System.out.println("Enter a phrase with lower case letters: ");
        scan.nextLine();
        String lowerCase = scan.nextLine();
        // lowerCase =lowerCase.toUpperCase();
        // System.out.println(lowerCase); // we have to reassign the uppercase version to the variable in order for it to work
        System.out.println(lowerCase.toUpperCase() ); // strings are immutable so to change things
        // java creates a new object with uppercase. But HERE this line does not seem to need a
        // reassignment as it is above

        scan.close();
    }
}

/*
        String name= "Melih";
        String middleName = new String ("Rüştü");
        String surname = new String ("Çalıkoğlu");
        System.out.println(name.charAt(0) + middleName.charAt(0) + surname.charAt(0));
*?
    }
} */
