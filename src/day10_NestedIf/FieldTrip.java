package day10_NestedIf;
import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your grade? ");
        int grade = scan.nextInt();
        String location ="";
        int groupNumber = 1;
        String teacher ="";


        if (grade >=1 && grade <=6) {
            if (grade == 1) {
                location = "Apple Orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else if (grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Mr. Wilson";
            }else if (grade == 4) {
                location = "Movie Theater";
                groupNumber = 2;
                teacher = "Ms. Reyes";
            }else if (grade == 5) {
                location = "Museum";
                groupNumber = 5;
                teacher = "Ms. Lea";
            }else {
                location = "Six Flags";
                groupNumber = 8;
                teacher = "Mr. Watt";
            }

        }

        System.out.println("Location : " + location + "\n Group : " + groupNumber + "\n Teacher In Charge : " + teacher);
    }
}
