package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("How many numbers do you want to enter?");
        int length = scan.nextInt();

        int [] numbers = new int[length];
        if (length <= 0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        for (int i = 0; i < length ; i++) {
            System.out.print("Enter a number: ");
            numbers [i] = scan.nextInt(); // each input user provided during each execution
            // of loop will be assigned to the next index of the array
            if (!(numbers[i]>=0)) {
                System.exit(0);
            }

        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}

/*
ask the user how many numbers he/she wants to enter
ask the user those numbers one by one and store them in an array

 */