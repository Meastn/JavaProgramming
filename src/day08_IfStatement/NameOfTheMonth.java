package day08_IfStatement;
import java.util.Scanner;

public class NameOfTheMonth {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Give the number of the month: ");
        int numberOfMonth = scan.nextInt();
        scan.close();

        if (numberOfMonth == 1) {
            System.out.println("Ocak ayındasınız");
        }
        if (numberOfMonth == 2) {
            System.out.println("Şubat ayındasınız");
        }
        if (numberOfMonth == 3) {
            System.out.println("Mart ayındasınız");
        }
        if (numberOfMonth == 4) {
            System.out.println("Nisan ayındasınız");
        }
        if (numberOfMonth == 5) {
            System.out.println("Mayıs ayındasınız");
        }
        if (numberOfMonth ==6) {
            System.out.println("Haziran ayındasınız");
        }
        if (numberOfMonth == 7) {
            System.out.println("Temmuz ayındasınız");
        }
        if (numberOfMonth == 8) {
            System.out.println("Ağustos ayındasınız");
        }
        if (numberOfMonth == 9) {
            System.out.println("Eylül ayındasınız");
        }
        if (numberOfMonth == 10) {
            System.out.println("Ekim ayındasınız");
        }
        if (numberOfMonth == 11) {
            System.out.println("Kasım ayındasınız");
        }
        if (numberOfMonth == 12) {
            System.out.println("Aralık ayındasınız");
        }
    }
}

/*
Write a program that displays the name of the month
 */