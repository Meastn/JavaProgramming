package day08_IfStatement;
import java.util.Scanner;

public class IsThereTea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çay hazır mı? (E / H):");
        char condition = scan.next().charAt(0);
        scan.close();

        boolean positiveForTea = condition == 'E';
    if (positiveForTea) {
            System.out.println("Çay varsa ofise gelirim");
        }
        if (!positiveForTea) {
            System.out.println("Çay yoksa ofise gelmem.");
        }


    }
}
