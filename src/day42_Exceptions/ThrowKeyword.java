package day42_Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("enter your age : ");
        int age = new Scanner(System.in).nextInt();

        if (age <0) {
            throw new InputMismatchException("Age can not be lower than 0: " + age);

        }

        if (age<21) {
            throw new RuntimeException("You must be at least 21 years old");
        }



    }
}
