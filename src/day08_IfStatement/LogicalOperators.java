package day08_IfStatement;

import com.sun.security.jgss.GSSUtil;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int creditScore1= 800;
        int age1 = 42;
        int income1= 40000;

        boolean isElligible1 = creditScore1 >= 700 && age1 >= 21 && income1 == 41000;

        System.out.println( name + " is elligible for credit: " + isElligible1);

        System.out.println("----------------------");
        String name2 = "Josh";
        int memberShipScore = 820;
        int age2=23;
        char gender = 'F';

        boolean isElligible2 = memberShipScore >= 700 && (gender == 'F' || gender == 'M');

        System.out.println( name2 + " is elligible for membership: " + isElligible2);
        System.out.println("----------------------");
        String name3= "Meriam";
        String countryOfBirth = "UK";
        String marriedToUSCitizen = "Yes";
        boolean isElligible3= countryOfBirth == "USA" || marriedToUSCitizen == "Yes";
        System.out.println( name3 + " is elligible for citizenship: " + isElligible3);
        System.out.println("----------------------");

        boolean result = true;
        boolean result1=!result;
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);

        System.out.println("----------------------");
        int score = 55;
        boolean passed = score >=85;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }
}
